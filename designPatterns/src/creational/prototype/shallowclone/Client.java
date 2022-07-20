package creational.prototype.shallowclone;

public class Client {
	public static void main(String[] args) {

		Person personPrevious, personNew;
		personPrevious = new Person();
		Courses courses = new Courses();
		personPrevious.setCourses(courses);
		personNew = personPrevious.clone();
		// �Ƚ�����
		System.out.println("�����Ƿ���ͬ�� " + (personPrevious == personNew));
		// �ȽϿγ�
		System.out.println("�����Ƿ���ͬ�� " + (personPrevious.getCourses() == personNew.getCourses()));
	}
}