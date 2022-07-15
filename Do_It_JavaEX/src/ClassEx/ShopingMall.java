package ClassEx;

public class ShopingMall {
	
	long ordernumber ;
	String id ;
	String date;
	String name;
	String productnumber;
	String address;
	
	
	
	
	
	public static void main(String[] args) {
		ShopingMall on = new ShopingMall();
		on.ordernumber = 201803120001L;
		on.id = "abc123";
		on.date = "2018년 3월 12일";
		on.name = "홍길순";
		on.productnumber = "PD0345-12";
		on.address = "서울시 영등포구 여의도동20번지";
		
		System.out.println(on.ordernumber);
		System.out.println(on.id);
		System.out.println(on.date);
		System.out.println(on.name);
		System.out.println(on.productnumber);
		System.out.println(on.address);
		
				
		
		
	
		

	}

}
