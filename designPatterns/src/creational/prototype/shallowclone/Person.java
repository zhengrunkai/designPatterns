package creational.prototype.shallowclone;

/**
 * 浅克隆
 * 当原型对象被复制时，只复制它本身和其中包含的值类型的成员变量，而引用类型的成员变量并没有复制
 */
public class Person implements Cloneable {

	private String name;

	private Courses courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	/**
	 * 使用clone()方法实现浅克隆
	 */
	@Override
	public Person clone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (Person)obj;
		}
		catch(CloneNotSupportedException e) {
			System.out.println("浅克隆error");
			return null;
		}
	}
}