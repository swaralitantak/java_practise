class Armstrong{
	public static void main(String[] args){
		int n=143;
		int temp=n;
		int sum=0;
		int rem=0;

		for(;n!=0;n=n/10){
			rem=n%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==temp){
			System.out.println(temp+" is a armstrong number.");
		} else{
			System.out.println(temp+" is not a armstrong number.");
		}
	}
}
