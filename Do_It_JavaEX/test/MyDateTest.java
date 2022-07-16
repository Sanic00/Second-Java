package test;
import java.util.*;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md1 = new MyDate(30, 2, 2000);
		System.out.println(md1.isValid());
		MyDate md2 = new MyDate(2, 10, 2006);
		System.out.println(md2.isValid());
	}

}
