class p3{
	public static void main(String[] args){
		int quantity=20;
		int totalCost= quantity*100;

		if(totalCost>1000){
			int finalCost=  totalCost-(totalCost*10)/100;
			System.out.println("The discounted price is "+finalCost);
		} else{
			System.out.println("The total bill is "+totalCost);
		}
	}
}
