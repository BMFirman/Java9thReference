class ForEach3 {
	public static void main(String[] args) { 
		// initalise sum with the value 0
		int sum = 0;
		// initalise a two dimensional array, 3X5
		// this can be done in two steps or one
		int nums[][];
		nums = new int[3][5];

		// give the nums in the array some values
		// outer array loop
		for(int i = 0; i < 3; i++) {
			// inner array loop
			for(int j = 0; j < 5; j++) {
				// value in array is the natural index value of i*j (0 =1)
				nums[i][j] = (i+1)*(j+1);
			}
		}

		// use the enhanced for to display all of the values
		// pass the virtual outer array
		for(int x[] : nums) {
			// extract the integer out of the passed inner array
			for (int y: x) {
				System.out.println("Value is " + y);
				sum += y;
			}
		}
		System.out.println("Summation: " + sum);
	}
}