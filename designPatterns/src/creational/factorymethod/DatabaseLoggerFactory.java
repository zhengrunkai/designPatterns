package creational.factorymethod;

/**
 * ���ݿ���־��¼�������࣬�䵱���幤����ɫ
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {

		return new DatabaseLogger();

	}

}