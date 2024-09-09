package comparatorjava8;

import java.util.*;

class Student {

	int rollno;
	String name;
	int age;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

public class ComparatorJava8 {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Comparator<Student> cm1 = Comparator.comparing(Student::getName).reversed();
		//Comparator<Student> cm1 = Comparator.comparing(Student::getName);
		Collections.sort(al, cm1);
		System.out.println("Sorting by Name");
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		// Sorting elements on the basis of age
		Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
		Collections.sort(al, cm2);
		System.out.println("Sorting by Age");
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
