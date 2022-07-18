package creational.factorymethod;

/**
 * 数据库日志记录器工厂类，充当具体工厂角色
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {

		return new DatabaseLogger();

	}

}