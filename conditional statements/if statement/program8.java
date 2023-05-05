class p8{
	public static void main(String[] args){
		float classHeld=70f;
		float classAttended=6f;

		float Attendence= (classAttended/classHeld)*100;
		System.out.print("Your attendance is: "+Attendence);

		if(Attendence>75f){
			System.out.println(" Permitted to give exams.");
		} else{
			System.out.println(" Not Permitted to give exams.");
		}
	}
}
