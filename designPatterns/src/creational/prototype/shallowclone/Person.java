package creational.prototype.shallowclone;

/**
 * ǳ��¡
 * ��ԭ�Ͷ��󱻸���ʱ��ֻ��������������а�����ֵ���͵ĳ�Ա���������������͵ĳ�Ա������û�и���
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
	 * ʹ��clone()����ʵ��ǳ��¡
	 */
	@Override
	public Person clone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (Person)obj;
		}
		catch(CloneNotSupportedException e) {
			System.out.println("ǳ��¡error");
			return null;
		}
	}
}