class p11{
	public static void main(String[] args){
		int x=-2, y=-100, z=-1;
	
		if((x>y)&&(x>z)){
			System.out.println(x+" is greatest.");
		} else if((y>x)&&(y>z)){
			System.out.println(y+" is greatest.");
		} else if((z>x)&&(z>y)){
			System.out.println(z+" is greatest.");
		} else if((x==y)&&(x>z)){
			System.out.println(x+" and "+y+" are greatest.");
		} else if((x==z)&&(x>y)){
			System.out.println(z+" and"+x+" are greatest.");
		} else if((y==z)&&(y>x)){
			System.out.println(z+" and"+y+" are greatest.");
		} else if((x==y)&&(y==z)){
			System.out.println("all numbers are equal.");
		} else{
			System.out.println("invalid number");
		}
		
	}
}
