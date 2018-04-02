// Search an array using. the for-each style loop
class Search {
	public static void main(String[] args) { 
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int val = 5;
		boolean found = false;

		// use the for-each to search for num sequentially
		for(int x: nums) {
			if(x == val) {
				found = true;
				System.out.print("Value found at natural position " + x);
				break;
			}	
		}
	}
}