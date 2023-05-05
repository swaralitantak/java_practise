class p1{
	public static void main(String[] args){
		int breadth=0;
		int length=12;

		if(length==0 | breadth==0){
			System.out.println("The values can not be zero or negative");
		} else if(length==breadth){
			System.out.println("It is a square");
		} else{
			System.out.println("It's not a square");
		}
	}
}
