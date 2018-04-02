import MyPack.Balance;

class AccountBalance2 {
    public static void main(String[] args) {
        Balance current [] = new Balance[3];

        current[0] = new Balance("B", 420);
        current[1] = new Balance("M", 69);
        current[2] = new Balance("D", 21);

        for(int i=0; i<3; i++) {
            current[i].show();
        }
    }
}