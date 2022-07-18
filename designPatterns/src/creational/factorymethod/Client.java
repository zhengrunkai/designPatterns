package creational.factorymethod;

public class Client {
	
	public static void main(String[] args) {

		Logger logger = new DatabaseLogger();
		logger.writeLog();

	}
}