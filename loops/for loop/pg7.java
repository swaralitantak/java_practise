class p7{
	public static void main(String[] args){
		int sume=0;
		int sumo=0;
		int n=1119200;
		int rem=0;

		while(n!=0){
			rem= n%10;
			n=n/10;

			if(rem==0){
				int temp=1;
			} else if(rem%2==0){
				sume= sume+rem;
			} else{
				sumo= sumo+rem;
			}

		}
		System.out.println(sume+sumo);

	}
}
