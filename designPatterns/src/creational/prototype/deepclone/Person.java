package creational.prototype.deepclone;
import java.io.*;

/**
 * 深克隆
 * 除了对象本身被复制外，对象所包含的所有成员变量也将被复制
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
	 * 使用序列化技术实现深克隆
	 */
	public Person deepClone() throws IOException, ClassNotFoundException {
		//将对象写入流中
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//将对象从流中取出
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (Person)ois.readObject();
	}
}