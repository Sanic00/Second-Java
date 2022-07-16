package ClassEx;

public class FunctionTest {
		
		int num1 ;
		int num2 ;
		static int result ;
		
		public static int add (int num1, int num2) {

			result = num1 + num2;
			return result;
		}
	
		public static int subtract(int num1, int num2) {
			result = num1 - num2;
			return result;
		}
	
		public static int times(int num1, int num2) {
			result = num1 * num2;
			return result;
		}
		
		public static int divided(int num1, int num2) {
			result = num1 / num2;
			return result;
		}
	
	public static void main(String[] args) {
		FunctionTest ft = new FunctionTest();
		ft.add(10,20);
	}

}
