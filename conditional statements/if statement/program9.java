class p9{
	public static void main(String[] args){
		float classHeld=70f;
		float classAttended=6f;
		float medc=1f;

		float Attendence= (classAttended/classHeld)*100;
		System.out.print("Your attendance is: "+Attendence);
		
		if(Attendence>75f){
				System.out.println(" Permitted to give exams.");
		} else if((Attendence<75f)&&(medc==1)){
			System.out.println(" Due to Medical reasons, permitted to give exams.");
	       	} else{
			System.out.println(" Not permitted to give exams.");
		}
	}
}
