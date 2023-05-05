class p6{
	public static void main(String[] args){
		int N=124;
		int rev=0;
		int rem=0;

		for(;N!=0;N=N/10){
			rem= N%10;
			rev= rev*10+rem;
		}
		System.out.println(rev);
	}
	
}
