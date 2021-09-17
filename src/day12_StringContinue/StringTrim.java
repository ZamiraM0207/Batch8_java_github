package day12_StringContinue;

public class StringTrim {

	public static void main(String[] args) {
		String str=" Hello Java          ";
		System.out.println(str.length());// print 12
		str=str.trim();//we have to assign str to the new value ,unless it doesnt update 
		System.out.println(str.length());// print 10 
		String str2 ="Hello       java";
		System.out.println(str2.length());
		str=str.trim();//can't remove the space inbetween 
		System.out.println(str2.length());//same as above


			
	}

}
