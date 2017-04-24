package command;

/**
 * 
 * <p>Description:操作遥控器的客户端,采用命令模式</p>
 * <p>命令模式将"请求"封装成对象,以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。(将具体的命令与该命令的接收者绑定在一起)</p>
 * <p>命令模式将发出请求的对象和执行请求的对象解耦。</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class RemoteLoader {
	public static void main(String[] args) {
		/*//创建遥控器对象,是命令的调用者
		RemoteController remoteController = new RemoteController();
		
		//创建命令的接收者对象
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		Stereo stereo = new Stereo("Living Room");
  
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
		
		//设置对应插槽的具体命令,每个命令都封装了执行命令的接收者
		remoteController.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteController.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteController.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteController.setCommand(3, stereoOnWithCD, stereoOff);
  
		System.out.println(remoteController);
 
		remoteController.onButtonWasPushed(0);
		remoteController.offButtonWasPushed(0);
		remoteController.onButtonWasPushed(1);
		remoteController.offButtonWasPushed(1);
		remoteController.onButtonWasPushed(2);
		remoteController.offButtonWasPushed(2);
		remoteController.onButtonWasPushed(3);
		remoteController.offButtonWasPushed(3);*/
		
		/*RemoteController remoteController = new RemoteController();
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanHighCommand ceilingFanOn = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
		remoteController.setCommand(2, ceilingFanOn, ceilingFanOff);
		System.out.println(remoteController);
		remoteController.onButtonWasPushed(2);
		remoteController.offButtonWasPushed(2);
		remoteController.undoButtonWasPressed(2);*/
//		remoteController.undoButtonWasPressed(2);
		
		RemoteController remoteController = new RemoteController();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		Stereo stereo = new Stereo("Living Room");
		
		//要执行的开启命令
		Command[] onCommands = {new LightOnCommand(livingRoomLight),new LightOnCommand(kitchenLight),
				new CeilingFanHighCommand(ceilingFan),new StereoOnWithCDCommand(stereo)};
		
		//要执行的关闭命令
		Command[] offCommands = {new LightOffCommand(livingRoomLight),new LightOffCommand(kitchenLight),
				new CeilingFanOffCommand(ceilingFan),new StereoOffCommand(stereo)};
		
		//创建开启的宏命令
		MacroCommand onMacroCommand = new MacroCommand(onCommands);
		
		//创建关闭的宏命令
		MacroCommand offMacroCommand = new MacroCommand(offCommands);
		
		//将宏命令插入插槽
		remoteController.setCommand(0, onMacroCommand, offMacroCommand);
		
		remoteController.onButtonWasPushed(0);
		remoteController.offButtonWasPushed(0);
		remoteController.undoButtonWasPushed();
		
	}
}
