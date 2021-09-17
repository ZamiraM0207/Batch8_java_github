package day16_Arrays;

import java.util.Arrays;

public class readarraybyIndex {

	public static void main(String[] args) {
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
		//task: change all the words first letter to upper case letter 
		
		
		for(String zamira: months) {
//			System.out.println(zamira);
			
			//System.out‘.println(Character.toString(zamira.charAt(0)).toUpperCase() + zamira.substring(1));
			
			String month = zamira;
			String month2 = month.toUpperCase();
			String month3 = month2.substring(0,1).concat(month.substring(1));
			System.out.println(month3);
			
		}
		
	}
	}
