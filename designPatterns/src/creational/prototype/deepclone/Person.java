package creational.prototype.deepclone;
import java.io.*;

/**
 * ���¡
 * ���˶����������⣬���������������г�Ա����Ҳ��������
 */
public class Person implements Serializable {

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
	 * ʹ�����л�����ʵ�����¡
	 */
	public Person deepClone() throws IOException, ClassNotFoundException {
		//������д������
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//�����������ȡ��
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (Person)ois.readObject();
	}
}