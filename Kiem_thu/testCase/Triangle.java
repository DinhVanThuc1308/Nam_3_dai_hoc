package testCase;

import java.util.*;
import org.junit.Test;


public class Triangle {
	
	public static void main(String[] args) {
		// write program check triangle in java
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao 3 canh của tam giác");
		System.out.println("nhap vao canh a");
		int a = sc.nextInt();
		System.out.println("nhap vao canh b");
		int b = sc.nextInt();
		System.out.println("nhap vao canh c");
		int c = sc.nextInt();
		
		int d ;
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("3 canh a,b,c tao thanh 1 tam giac");
			 d =1;
			 if(a==b && b==c) {
				d = 2;
				 
			 }else if(a==b || b==c || a==c) {
				 d= 3;
				}
				 else {
					 d=4;
				 }
				
				
		}
		else {
			System.out.println("3 canh a,b,c khong tao thanh 1 tam giac");
			d=9;
		}
		
			// System.out.println("nhap vao 3 canh của tam giác");
			// a = sc.nextInt();
			// b = sc.nextInt();
			// c = sc.nextInt();
			 switch(d  ){
				// case (a*a  + b*b == c*c && a*a + c*c == b*b && c*c + b*b == a*a):System.out.println("tam giac vuong");break;
				case 1:System.out.println("tam giac deu");break;
				case 2:System.out.println("tam giac can");break;
				 case 3:System.out.println("tam giac vuong");break;
			 }
		
	}
	@Test
	public void testMain() {
		essrtEquals(2, Triangle(3,3,3));
		
	}

	

}