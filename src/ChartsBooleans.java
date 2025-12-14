public class ChartsBooleans {
    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044'; // Unicode for 'D'
        char myNumericChar = 68; // ASCII value for 'D'
        System.out.println("My char value = " + myChar);
        System.out.println("My Unicode char value = " + myUnicodeChar);
        System.out.println("My numeric char value = " + myNumericChar);

        char questionMarkRegular = '?';
        char questionMarkUnicode = '\u003F';
        char questionMarkNumeric = 63;
        System.out.println("Question mark regular = " + questionMarkRegular);
        System.out.println("Question mark Unicode = " + questionMarkUnicode);
        System.out.println("Question mark numeric = " + questionMarkNumeric);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println("My true boolean value = " + myTrueBooleanValue);
        System.out.println("My false boolean value = " + myFalseBooleanValue);

        int customerAge = 30;
        boolean isCustomerOver18 = customerAge > 18;
        System.out.println("Is the customer over 18? " + isCustomerOver18);
    }
}
