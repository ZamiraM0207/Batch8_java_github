package day17_arrayContinue;

public class task1_Capitilizethefirstletter {

	public static void main(String[] args) {
//		input:
		//"january";  
//		output:
		//"January"
		String[] months = new String[12];
		months[0] = "january";  //"January"
		months[1] = "feburary";
		months[2] = "march";
		months[3] = "april";
		months[4] = "may";
		months[5] = "june";
		months[6] = "july";
		months[7] = "august";
		months[8] = "september";
		months[9] = "october";
		months[10] = "november";
		months[11] = "december";
		for(String zamira: months) {
//			System.out.println(zamira);
			
//			System.out.println(Character.toString(zamira.charAt(0)).toUpperCase() + zamira.substring(1));
			
			String month = zamira;
			String month2 = month.toUpperCase();
			String month3 = month2.substring(0,1).concat(month.substring(1));
			System.out.println(month3);			
		}

	
		
//		String month = "january";
//		String month2 = month.toUpperCase();
//		System.out.println(month);
//		System.out.println(month2);
//	
//		String month3 = month2.substring(0,1).concat(month.substring(1));
//		
//		System.out.println(month3);
	
	}
}
