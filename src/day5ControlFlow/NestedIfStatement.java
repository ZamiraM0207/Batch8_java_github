package day5ControlFlow;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		
int temp=70;
boolean sunny=false;
if (temp>90) {
	if (sunny) {
		System.out.println("Beach");
	}else {
		System.out.println("Movie");
	}
}else {
	if (sunny) {
		System.out.println("tennis");
	}else {
		System.out.println("soccer");
		}
	}
}
	}


