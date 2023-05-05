class p12{
	public static void main(String[] args){
		float num=1000000.1f;

		if(num==0f){
			System.out.println("the number is zero.");
		} else if((num<1000000f)&&(num>0f)){
			System.out.println("the number is positive.");	
		} else if((num<1000000f)&&(num<0f)){
			System.out.println("the number is negative.");
		} else if(num>1000000f){
			System.out.println("the number is large.");
		}
	}	
}
