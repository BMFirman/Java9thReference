// Demonstrate the one dimenstional array
class Array {
	public static void main(String[] args) {
		
		/*
			int month_days []; // declare
			month_days = new int[12]; // define size
			// define the contents
			month_days[0] = 31;	
			month_days[1] = 28;
			month_days[2] = 31
			month_days[3] = 30
			month_days[4] = 31
			month_days[5] = 30
			month_days[6] = 31
			month_days[7] = 31
			month_days[8] = 30
			month_days[9] = 31
			month_days[10] = 30
			month_days[11] = 31
		*/
		int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("April has " + month_days[3] + " days.");
	}
}