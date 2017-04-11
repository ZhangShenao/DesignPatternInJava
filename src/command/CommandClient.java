package command;

/**
 * 
 * <p>Description:命令模式的客户端,使用遥控器执行各种命令</p>
 * <p>命令模式,将请求封装成对象,以便使用不同的请求、队列或者日志来参数化其他的对象。命令模式也支持可撤销的操作</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class CommandClient {
	public static void main(String[] args) {
		//创建调用者对象
		SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
		
		//创建具体的接收者对象
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		//创建具体的命令对象
		Command lightOnCommand = new LightOnCommand(light);
		Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		//将命令对象传给调用者
		simpleRemoteController.setCommand(lightOnCommand);
		//调用这在适当的时候,执行命令
		simpleRemoteController.onButtonPressed();
		
		
		simpleRemoteController.setCommand(garageDoorOpenCommand);
		simpleRemoteController.onButtonPressed();
		
	}
}
