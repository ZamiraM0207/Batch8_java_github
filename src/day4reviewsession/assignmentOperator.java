package day4reviewsession;

public class assignmentOperator {

	public static void main(String[] args) {

		int a=5;
		int b=a;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	
	a+=3; //a=a+3 the value of a is updated to 8
	System.out.println(a);//8
	a+=10; //a=a+10 the value of a is updated to 18
	System.out.println(a);//18
	a-=5;//a=a-5 the value of a is updated to 13
	System.out.println(a);
	System.out.println(b);// b is still holding 5 no change 
	
	b*=5; //b=b*5 the value of b is updated to 25 
	System.out.println(b);
	b%=6; 
	System.out.println(b);
	
	
	
	
	
	
	
	
	
	
	}
}
