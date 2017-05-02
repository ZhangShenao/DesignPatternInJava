package mvc;
  
import javax.sound.midi.*;
import java.util.*;

/**
 * 
 * <p>Description:BeatModel模型类</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
	/**
	 * 定序器,用来产生真实的节拍
	 */
    private Sequencer sequencer;
    
    /**
     * 保存所有BeatObserver
     */
    private ArrayList<BeatObserver> beatObservers = new ArrayList<>();
	
	/**
     * 保存所有BPMObserver
     */
    private ArrayList<BPMObserver> bpmObservers = new ArrayList<>();
	
    /**
     * 默认BPM=90
     */
    private int bpm = 90;
    
    private Sequence sequence;
    private Track track;
 
	public void initialize() {
		//设置定序器和节拍音轨
        setUpMidi();
        buildTrackAndStart();
	}
 
    public void on() {
    	//开启定序器,并将BPM设置为默认值90
        sequencer.start();
        setBPM(90);
    }
 
    public void off() {
    	//将BPM设置为0,并关闭定序器
		setBPM(0);
		sequencer.stop();
    }
 
    public void setBPM(int bpm) {
    	//设置当前BPM值
		this.bpm = bpm;
		
		//设置定序器的BPM
		sequencer.setTempoInBPM(getBPM());
		
		//通知所有BPMObserver
		notifyBPMObservers();
    }
  
	public int getBPM() {
		return bpm;
	}
	
	/**
	 * 新的节拍开始,通知所有的BeatObserver
	 */
	public void beatEvent() {
		notifyBeatObservers();
	}
  
   
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}
  
	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = beatObservers.get(i);
			observer.updateBeat();
		}
	}
  
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}
  
	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = bpmObservers.get(i);
			observer.updateBPM();
		}
	}


	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}



	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}


    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
			beatEvent();
        	sequencer.start();
        	setBPM(getBPM());
        }
    }

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch(Exception e) {
				e.printStackTrace();
		}
    } 

     public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
    
        sequence.deleteTrack(null);
        track = sequence.createTrack();

      	makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));      
	 	try {
			sequencer.setSequence(sequence);                    
		} catch(Exception e) {
			e.printStackTrace();
		}
    } 
            
    public void makeTracks(int[] list) {        
       
       for (int i = 0; i < list.length; i++) {
          int key = list[i];

          if (key != 0) {
             track.add(makeEvent(144,9,key, 100, i));
             track.add(makeEvent(128,9,key, 100, i+1));
          }
       }
    }
        
    public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
            
        } catch(Exception e) {
			e.printStackTrace(); 
		}
        return event;
    }

}
