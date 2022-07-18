package creational.factorymethod;

/**
 * �ļ���־��¼�������࣬�䵱���幤����ɫ
 */
public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {

		return new FileLogger();

	}

}