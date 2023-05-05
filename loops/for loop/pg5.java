class p5{
	public static void main(String[] args){
		int a=10;
		int b=0;
		int aPower_b=1;
		int bPower_a=1;

		for(int i=1;i<=b;i++){
			aPower_b= aPower_b*a;
		}
		for(int i=1;i<=a;i++){
			bPower_a=bPower_a*b;
		}

		System.out.println(aPower_b);
		System.out.println(bPower_a);
	}
}
