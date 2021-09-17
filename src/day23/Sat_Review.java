package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sat_Review {

	public static void main(String[] args) {
		//Create a 2D ArrayList with 2 rows such that the the first row is a list of people
		//second row is a list of the city each person lives in
		
		//Brian, Karen, Graham
		//Fairfax, Ashburn, Reston
		
		
		//Brian, Graham, Karen
		//Fairfax, Reston, Ashburn
		
	
		//Sort the 2d ArrayList by name of person

		List<String> names=new ArrayList<>(Arrays.asList("Brain","Karen","Graham"));
		List<String> city=new ArrayList<>(Arrays.asList("Fairfax","Ashburn","Reston"));
		
	
		
		List<String> sortedNames = new ArrayList<>();
		sortedNames = (List<String>) ((ArrayList<String>) names).clone();
		Collections.sort(sortedNames);
		List<String> sortedCity = new ArrayList<>();
		//Brian, Karen, Graham
		//Fairfax, Ashburn, Reston
		
		//Brian, Graham, Karen
		
		for(int i=0; i<sortedNames.size(); i++) {
			
			for(int j =0; j<names.size(); j++) {
				if (sortedNames.get(i).equals(names.get(j))) {
					sortedCity.add(city.get(j));					
				}
			}
			
		}
		
		System.out.println(sortedNames.toString());
		System.out.println(sortedCity.toString());







	}

}
