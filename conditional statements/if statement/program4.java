class p4{
	public static void main(String[] args){
		int salary=1000;
		int years=6;

		if(years>5){
			int bonus= (salary*5)/100;
		       System.out.println("bonus: "+bonus);	
		} else{
			System.out.println("Bonus doesnt apply to this profile");
		}
	}
}
