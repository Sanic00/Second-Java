package ClassEx;

public class Person {
	int age;
	String name;
	boolean married;
	int child;
	

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.age = 40;
		System.out.println("�� ����� ���̴�"+person1.age+"�̰�");
		
		Person person2 = new Person();
		person2.name = "James";
		System.out.println("�̸���"+person2.name+"�̰�");
		
		Person person3 = new Person();
		person3.married = true;
		System.out.println("��ȥ���δ�"+person3.married);
		
		Person person4 = new Person();
		person4.child = 3;
		System.out.println("�ڽ���"+person4.child+"���� �ֽ��ϴ�.");
		
		
		
	}

}
