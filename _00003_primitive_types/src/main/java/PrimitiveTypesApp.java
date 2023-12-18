public class PrimitiveTypesApp {

    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Integer range: (" + minValue + "," + maxValue + ")");

        System.out.println("Busted max value: " + (maxValue + 1));
        System.out.println("Busted min value: " + (minValue - 1));

        int willThisCompile = Integer.MAX_VALUE + 1;   // yes
        int willThisCompile2 = 2147483647 + 1;   // yes

        // int willThisCompile3 = 2147483648;   // no, compile time error

        // int myMaxIntTest = 2,147,483,647; // wont compile

        int myMaxIntTest = 2_147_483_647; // works
    }


}
