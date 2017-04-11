package command;

/**
 * 
 * <p>Description RemoteLoader创建许多命令对象,并将这些命令对象加载到遥控器的插槽中</p>
 * <p>当需要将发出请求的对象和执行请求的对象解耦时,可以使用命令模式</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class RemoteLoader {
	public static void main(String[] args) {
		//创建3个插槽的遥控器
		RemoteController remoteController = new RemoteController(3);
		
		//创建具体的接收者
		Light bedroomLight = new Light("卧室电灯");
		Light kitchenLight = new Light("厨房电灯");
		GarageDoor garageDoor = new GarageDoor();
		CeilingFan ceilingFan = new CeilingFan("天花板吊扇");
		
		//创建启动的宏命令
		Command[] onCommands = {new LightOnCommand(bedroomLight),new LightOnCommand(kitchenLight),
				new GarageDoorOpenCommand(garageDoor),new CeilingFanHighCommand(ceilingFan)};
		MacroCommand on = new MacroCommand(onCommands);
		
		//创建关闭的宏命令
		Command[] offCommands = {new LightOffCommand(bedroomLight),new LightOffCommand(kitchenLight),
				new GarageDoorCloseCommand(garageDoor),new CeilingFanOffCommand(ceilingFan)};
		MacroCommand off = new MacroCommand(offCommands);
		
		//将宏命令载入到插槽中
		remoteController.setCommand(0, on, off);
		
		//执行宏命令
		remoteController.onButtonPressed(0);
		remoteController.offButtonPressed(0);
		remoteController.undoButtonPressed();
		
		
		/*
		
		//创建命令对象,并将命令对象加载到插槽中
		remoteController.setCommand(0, new LightOnCommand(bedroomLight), new LightOffCommand(bedroomLight));
		remoteController.setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
		remoteController.setCommand(2, new GarageDoorOpenCommand(garageDoor), new GarageDoorCloseCommand(garageDoor));
		
		//显示遥控器
		System.out.println(remoteController);
		
		//按下遥控器按钮
		remoteController.onButtonPressed(1);
		remoteController.offButtonPressed(2);
		
		//按下撤销按钮
		remoteController.undoButtonPressed();
		remoteController.undoButtonPressed();*/
		
		//创建天花板吊扇
//		CeilingFan ceilingFan = new CeilingFan("天花板吊扇");
//		remoteController.setCommand(0, new CeilingFanHighCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));
//		remoteController.setCommand(1, new CeilingFanMiddleCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));
//		remoteController.setCommand(2, new CeilingFanLowCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));
		
		//执行命令
		/*remoteController.onButtonPressed(0);
		remoteController.onButtonPressed(1);
		remoteController.undoButtonPressed();
		remoteController.undoButtonPressed();*/
	}
}
