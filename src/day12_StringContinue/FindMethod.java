package day12_StringContinue;

public class FindMethod {

	public static void main(String[] args) {
/* Find (indexOf) a given word 
 * String name =“President George Washington";
name.indexOf (‘P');		      0
name.indexOf (‘e');		      2
name.indexOf (“George");	    10
name.indexOf (‘e', 3);		      6   

name.indexOf (“Bob");	    -1
name.lastIndexOf (‘e');	    15
*/
		//            012345678910
		String name ="President George Washington";
		System.out.println(name.indexOf('P'));
		System.out.println(name.indexOf('e'));
		System.out.println(name.indexOf("George"));
		System.out.println(name.indexOf('e',3));//Starts searhing at postion 3,which means from 'e'
		System.out.println(name.indexOf("zamira"));//(not found)
		System.out.println(name.lastIndexOf('e'));
		System.out.println(name.lastIndexOf('o'));
//how do we know the index positon of last leter
		System.out.println(name.length()-1);
//		System.out.println(name.charAt(26));//n hardcode 
		System.out.println(name.charAt(name.length()-1));//n dynamic code 
		
		
		
		

		
		


		

	}

}
