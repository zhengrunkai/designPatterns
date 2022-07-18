package creational.factorymethod;

/**
 * 日志记录器工厂接口，充当抽象工厂角色
 */
public interface LoggerFactory {

	/**
	 * 抽象工厂方法
	 */
	public Logger createLogger();

}
