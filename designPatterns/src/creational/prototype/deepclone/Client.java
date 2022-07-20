package creational.prototype.deepclone;

public class Client {
	public static void main(String[] args) {
		Person personPrevious, personNew = null;
		personPrevious = new Person();
		Courses courses = new Courses();
		personPrevious.setCourses(courses);
		try {
			personNew = personPrevious.deepClone();
			// 比较人物
			System.out.println("人物是否相同？ " + (personPrevious == personNew));
			// 比较课程
			System.out.println("名称是否相同？ " + (personPrevious.getCourses() == personNew.getCourses()));
		}
		catch(Exception e) {
			System.err.println("克隆失败！");
		}
	}
}