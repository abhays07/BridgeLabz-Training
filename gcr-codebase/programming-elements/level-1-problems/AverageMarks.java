public class AverageMarks{
	public static int marks(int m, int p, int c){
		int average = (m+p+c)/3;
		return average;
	}
	public static void main(String [] args){
		
		int maths=94, physics=95, chemistry=96;
		System.out.println( "Sam's average marks in PCM is : " + marks(maths, physics, chemistry));
	}
}