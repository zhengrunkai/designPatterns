package creational.prototype.deepclone;

public class Client {
	public static void main(String[] args) {
		Person personPrevious, personNew = null;
		personPrevious = new Person();
		Courses courses = new Courses();
		personPrevious.setCourses(courses);
		try {
			personNew = personPrevious.deepClone();
			// �Ƚ�����
			System.out.println("�����Ƿ���ͬ�� " + (personPrevious == personNew));
			// �ȽϿγ�
			System.out.println("�����Ƿ���ͬ�� " + (personPrevious.getCourses() == personNew.getCourses()));
		}
		catch(Exception e) {
			System.err.println("��¡ʧ�ܣ�");
		}
	}
}