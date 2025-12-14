public class Integers {
    public static void main(String[] args) {
        int a = 1;
        int b = 88;
        double c = 13.14;

        double total = a + b +c;

        System.out.println(total);

        double theLastOne = 1000 - total;

        System.out.println(theLastOne);

        int minValue = Integer.MIN_VALUE;

        System.out.println(minValue);

        int maxValue = Integer.MAX_VALUE;

        System.out.println(maxValue);

        String minMessage = "The minimum integer value is = " + minValue;
        String maxMessage = "The maximum integer value is = " + maxValue;
        System.out.println(minMessage);
        System.out.println(maxMessage);

        String bustedMinValue = "Busted min value = " + (minValue - 1);;
        String bustedMaxValue = "Busted max value = " + (maxValue + 1);;
        System.out.println(bustedMinValue);
        System.out.println(bustedMaxValue);

        int underscoreInt = 2_147_483_647;
        System.out.println("Underscore int = " + underscoreInt);
    }
}
