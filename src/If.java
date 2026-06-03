public class If {
    public static void main(String args[]) {
        boolean condition = true;

        if(condition) {
            System.out.println("True condition");
        } else {
            System.out.println("False condition");
        }

        int chosen = 2;
        Object theNumber = "No number yet";

        if(chosen > 0 && chosen < 4) {
            theNumber = chosen;
        }

        System.out.println(theNumber);
    }
}
