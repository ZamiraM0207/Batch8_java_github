package day24__methodIntro;

public class methodIntro {

	public static void main(String[] args) {
		
		multification (5,6);
		multification (8,6);
		multification (9,6);
		elimination (12,3);
		elimination (48,6);
		elimination (50,5);
		subtraction (100,50);
		subtraction(40,18);
		subtraction (23,5); 
	}
	

	public static void multification (int num1 ,int num2) {
		
		
		System.out.println(num1*num2);
	}
	
public static void elimination (int num3 ,int num4) {
		
		
		System.out.println(num3/num4);
		
		
}

public static void subtraction (int num5 ,int num6) {
	
	
	System.out.println(num5-num6);

}
}
