// This program will not compile as you cannot define the same varaible name in two scopes
class ScopeErr {
	public static void main(String[] args) {
		int bar = 1;
		{
			// int bar = 2; will result in a compile time error
		}
	}
}