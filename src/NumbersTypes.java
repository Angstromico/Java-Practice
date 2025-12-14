public class NumbersTypes {
    public static void main(String[] args) {
        String minAndMaxByte = "The minimum byte value is = " + Byte.MIN_VALUE + "\n" +
                "The maximum byte value is = " + Byte.MAX_VALUE;
        System.out.println(minAndMaxByte);

        String minAndMaxShort = "The minimum short value is = " + Short.MIN_VALUE + "\n" +
                "The maximum short value is = " + Short.MAX_VALUE;
        System.out.println(minAndMaxShort);

        long myLongValue = 100L; // The L can be lowercase or uppercase
        System.out.println("My long value = " + myLongValue);

        String minAndMaxLong = "The minimum long value is = " + Long.MIN_VALUE + "\n" +
                "The maximum long value is = " + Long.MAX_VALUE;
        System.out.println(minAndMaxLong);

        String longSize = "The size of long type is = " + Long.BYTES + " bytes and " +
                Long.SIZE + " bits.";
        System.out.println(longSize);
    }
}
