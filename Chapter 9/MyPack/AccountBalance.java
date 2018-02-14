// a simple package
package MyPack;


class AccountBalance {
    public static void main(String[] args) {
        Balance current [] = new Balance[3];

        current[0] = new Balance("Bailey", 420);
        current[1] = new Balance("Mitchell", 69);
        current[2] = new Balance("Dhiren", 21);

        for(int i=0; i<3; i++) {
            current[i].show();
        }
    }
}