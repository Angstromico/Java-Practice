public class Loop {
    public static void main(String[] args) {
        int five = 5;

        while (five != 0) {
            System.out.println("Five is now: " + five);
            five--;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
