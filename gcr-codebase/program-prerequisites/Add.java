class Add{
	public static int AddTwoNumbers(int a, int b){
			int sum =0; 
			sum=a+b;
			return sum;
	}
		public static void main (String [] args){
		int result = AddTwoNumbers(5,10);
		System.out.println( " The sum is : " + result);
		}
}