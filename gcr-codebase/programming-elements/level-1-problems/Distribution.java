public class Distribution {
	public static void distribute(){
		int pens =14;
		int students = 3;
		
		int remainder = pens%students;
		int eachStudent= pens/students;
		
		System.out.println("The Pen Per Student is "+ eachStudent + " and the remaining pen not distributed is "+remainder);

	
	}
	public static void main(String [] args){
		distribute();
	}
 }