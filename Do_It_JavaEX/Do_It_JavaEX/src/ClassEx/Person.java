package ClassEx;

public class Person {
	int age;
	String name;
	boolean married;
	int child;
	

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.age = 40;
		System.out.println("이 사람의 나이는"+person1.age+"이고");
		
		Person person2 = new Person();
		person2.name = "James";
		System.out.println("이름은"+person2.name+"이고");
		
		Person person3 = new Person();
		person3.married = true;
		System.out.println("결혼여부는"+person3.married);
		
		Person person4 = new Person();
		person4.child = 3;
		System.out.println("자식은"+person4.child+"명이 있습니다.");
		
		
		
	}

}
