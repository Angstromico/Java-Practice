public class Decimals {
    public static void main(String[] args) {
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        String minAndMaxFloat = "The minimum float value is = " + minFloatValue + "\n" +
                "The maximum float value is = " + maxFloatValue;
        System.out.println(minAndMaxFloat);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        String minAndMaxDouble = "The minimum double value is = " + minDoubleValue + "\n" +
                "The maximum double value is = " + maxDoubleValue;
        System.out.println(minAndMaxDouble);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;

        System.out.println("The int value is = " + intValue);
        System.out.println("The float value is = " + floatValue);
        System.out.println("The double value is = " + doubleValue);

        float floatExample = 5.25f; // Suffix f is required for float literals
        double doubleExample = 5.25; // Suffix d is optional for double literals

        System.out.println("Float example value = " + floatExample);
        System.out.println("Double example value = " + doubleExample);

        int pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
    }
}
