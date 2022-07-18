####工厂方法模式：
定义一个用于创建对象的接口，但是让子类决定将哪一个类实例化。
工厂方法模式让一个类的实例化延迟到其子类。

####工厂方法模式的结构√工厂方法模式包含以下4个角色：
1. Product（抽象产品）
2. ConcreteProduct（具体产品）
3. Factory（抽象工厂） 
4. ConcreteFactory（具体工厂）

####实例代码：
1. Logger：日志记录器接口，充当抽象产品角色 
2. 2.DatabaseLogger：数据库日志记录器，充当具体产品角色
3. FileLogger:文件日志记录器，充当具体产品角色
4. LoggerFactory:日志记录器工厂接口，充当抽象工厂角色
5. DatabaseLoggerFactory:数据库日志记录器工厂类，充当具体工厂角色
6. FileLoggerFactory:文件日志记录器工厂类，充当具体工厂角色


