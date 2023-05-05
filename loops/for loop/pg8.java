class p8{
	public static void main(String[] args){
		int multiple=0;
		int n=1;

		for(int i=1; i<=n;i++){
			if(n==0){
				System.out.println("Zero is neither prime nor a composite number.");
			}else if(n%i==0){
				multiple++;
			}
		}

			if(multiple==2){
				System.out.println(n+" is a prime number.");
			} else{
				System.out.println(n+" is not a prime number.");
			}
		
	}
}
