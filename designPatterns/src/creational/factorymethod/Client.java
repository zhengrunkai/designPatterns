package creational.factorymethod;

public class Client {
	
	public static void main(String[] args) {

		Logger logger = new FileLogger();
		logger.writeLog();

	}
}