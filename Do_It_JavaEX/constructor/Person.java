package constructor;

public class Person {
		String name;
		float height;
		float weight;
		
		public Person() {

		}
		
		
		public Person(String pname) {
		 name = pname;
		}
		
		public Person(String paname, float height) {
			this.name = paname;
			this.height = height;	
		}
		
		public Person(String paname, float height, float weight) {
			this.name = paname;
			this.height = height;	 
			this.weight = weight;	
			}
		
	public static void main(String[] args) {
		Person p = new Person("³ªÃ÷¸ðÅä", 176.5f, 75.6f);
		
		
		
		
		
	}

}
