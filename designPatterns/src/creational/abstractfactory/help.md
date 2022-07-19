####抽象工厂模式：
提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。

####抽象工厂模式包含以下4个角色：
1. AbstractFactory（抽象工厂）
2. ConcreteFactory（具体工厂）
3. AbstractProduct（抽象产品）
4. ConcreteProduct（具体产品）

####实例代码：
1. Button：按钮接口，充当抽象产品
2. SpringButton：Spring按钮类，充当具体产品
3. SummerButton：Summer按钮类，充当具体产品
4. TextField：文本框接口，充当抽象产品
5. SpringTextField：Spring文本框类，充当具体产品
6. SummerTextField：Summer文本框类，充当具体产品
7. ComboBox：组合框接口，充当抽象产品
8. SpringComboBox：Spring组合框类，充当具体产品
9. SummerComboBox：Summer组合框类，充当具体产品
10. SkinFactory：界面皮肤工厂接口，充当抽象工厂
11. SpringskinFactory：Spring皮肤工厂，充当具体工厂
12. SummerSkinFactory：Summer皮肤工厂，充当具体工厂
13. Client：客户端测试类

