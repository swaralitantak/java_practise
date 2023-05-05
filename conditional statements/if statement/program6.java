class p6{
	public static void main(String[] args){
		int num1=10;
		int num2=200;
		int num3=200;

		if((num1==num2)&&(num1>num3)){
			System.out.println(num1+" and "+num2+" are equal and are greater than "+num3);
		} else if((num1==num2)&&(num1<num3)){
			System.out.println(num1+" and "+num2+" are equal and are less than "+num3);
		} else if((num1==num3)&&(num1>num2)){
			System.out.println(num1+" and "+num3+" are equal and are greater than "+num2);
		} else if((num1==num3)&&(num1<num2)){
			System.out.println(num1+" and "+num3+" are equal and are less than "+num2);
		} else if((num2==num3)&&(num2>num1)){
			System.out.println(num2+" and "+num3+" are equal and are greater than "+num1);
		} else if((num2==num3)&&(num2<num1)){
			System.out.println(num2+" and "+num3+" are equal and are less than "+num1);
		} else if((num1>num2)&&(num1>num3)){
			System.out.println(num1+" is largest.");
		} else if((num2>num1)&&(num2>num3)){
			System.out.println(num2+" is largest.");
		} else if((num3>num1)&&(num3>num2)){
			System.out.println(num3+" is largest.");
		} else{
			System.out.println("Invalid number.");
		}
	}
}
