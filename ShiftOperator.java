//24. Uses of Shift Operator.

public class ShiftOperator {
    public static void main(String[] args) {
        int num = 100; // For testing shift operator let the number be 100.

        // Left Shift operator '<<'
        System.out.println("Left shift 1 time  : " + (num << 1)); // The number left shift by 1 Doubles the value.
        System.out.println("Left shift 2 times : " + (num << 2)); // The number left shift by 2 Four times the value.
        System.out.println("Left shift 3 times : " + (num << 3) + "\n"); // The number left shift by 3 Sixteen times the
                                                                         // value.

        // Right Shift operator '>>'
        System.out.println("Right shift 1 time  : " + (num >> 1)); // The number right shift by 1 halfs (1/2) the value.
        System.out.println("Right shift 2 times : " + (num >> 2)); // The number right shift by 2 one forths (1/4) the
                                                                   // value.
        System.out.println("Right shift 3 times : " + (num >> 3) + "\n"); // The number right shift by 3 one sixteenths
                                                                          // (1/16) the value.

        // So, the formula of Left shifting a number is : result = num*(2'n). (Where n =
        // 1,2,3,4,5.......)
        // And the formula of Right shifting a number is : result = num/(2'n). (Where n
        // = 1,2,3,4,5.......)

        /*
         * There is also another shift operator called Unsigned Shift Operator '>>>'.
         * It is same as the Right Shift but while we apply it to a negative number
         * it converts it into a large valued positive number.
         */

        System.out.println("Unsigned shift 1 time  : " + (num >>> 1)); // The number Unsigned shift by 1 halfs (1/2) the
                                                                       // value.
        System.out.println("Unsigned shift to a Negative number 1 time : " + (-100 >>> 1)); // This converts the
                                                                                            // Negative number to a
                                                                                            // large valued positive
                                                                                            // number.

    }
}