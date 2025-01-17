class Main2
{
	public static void main(String args[]) {
		int x = Integer.parseInt(args[0]);
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(x+" * "+i+" = "+x*i);
		}
	}
}

class Student
{
	String name;
	int age;
	void set_name(String n) {
		name = n;
	}
	void set_age(int a) {
		age = a;
	}
	String get_name() {
		return name;
	}
	int get_age() {
		return age;
	}
}

public class Main extends Student
{
	public static void main(String args[]) {
		Student A = new Student();
		A.set_name("Bhaumik");
		A.set_age(20);
		System.out.println("Name: "+A.get_name()+" "+"Age: "+A.get_age());
	}
}