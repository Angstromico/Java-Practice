public class CastingPrimitiveTypes {
    public static void main(String[] args) {
        int myIntValue = 130;
        byte myByteValue = (byte) myIntValue; // Casting int to byte
        System.out.println("My byte value after casting = " + myByteValue);

        double myDoubleValue = 9.78;
        int myCastedIntValue = (int) myDoubleValue; // Casting double to int
        System.out.println("My int value after casting = " + myCastedIntValue);

        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

        byte myNewByteValue = (byte) (myMinByteValue / 2); // Casting result to byte
        System.out.println("My new byte value after casting = " + myNewByteValue);

        byte myNewByteValue2 = (byte) (myMaxByteValue / 2); // Casting result to byte
        System.out.println("My new byte value 2 after casting = " + myNewByteValue2);

        short myNewShortValue = (short) (myMinShortValue / 2); // Casting result to short
        System.out.println("My new short value after casting = " + myNewShortValue);

        int myNewIntValue = myMinIntValue / 2; // No casting needed
        System.out.println("My new int value = " + myNewIntValue);
    }
}
