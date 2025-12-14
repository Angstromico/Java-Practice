public class Operators {
    public static void main(String[] args) {
        // Example usage of arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Example usage of increment and decrement operators
        int c = 10;
        c++; // Increment
        System.out.println("After increment: " + c);
        c--; // Decrement
        System.out.println("After decrement: " + c);

        // Example usage of compound assignment operators
        int d = 10;
        d += 5; // Equivalent to d = d + 5
        System.out.println("After += 5: " + d);
        d -= 3; // Equivalent to d = d - 3
        System.out.println("After -= 3: " + d);
        d *= 2; // Equivalent to d = d * 2
        System.out.println("After *= 2: " + d);
        d /= 4; // Equivalent to d = d / 4
        System.out.println("After /= 4: " + d);
        d %= 3; // Equivalent to d = d % 3
        System.out.println("After %= 3: " + d);

        // Example usage of relational operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater Or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less Or Equal: " + isLessOrEqual);

        // Example usage of logical operators
        boolean x = true;
        boolean y = false;
        boolean andResult = x && y; // Logical AND
        boolean orResult = x || y;  // Logical OR
        boolean notResult = !x; // Logical NOT
        
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT: " + notResult);

        // Example usage of bitwise operators
        int bitwiseAnd = a & b; // Bitwise AND
        int bitwiseOr = a | b;  // Bitwise OR
        int bitwiseXor = a ^ b; // Bitwise XOR
        int bitwiseNot = ~a; // Bitwise NOT
        
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT: " + bitwiseNot);

        // Example usage of shift operators
        int leftShift = a << 2; // Left shift
        int rightShift = a >> 2; // Right shift (signed)
        int unsignedRightShift = a >>> 2; // Right shift (unsigned)

        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
        System.out.println("Unsigned Right Shift: " + unsignedRightShift);

        // Ternary operator example
        int max = (a > b) ? a : b;
        System.out.println("Max value using ternary operator: " + max);

        // Example of operators on charts

        char charA = 'A';
        char charB = 'B';
        int charDifference = charB - charA; // Subtracting char values
        System.out.println("Difference between charB and charA: " + charDifference);
    }
}
