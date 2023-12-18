public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte myByteValue = 0;
        short myShortValue = Byte.MAX_VALUE;
        int myIntValue = Short.MAX_VALUE;
        long sum = 50_000 + 10 *(myByteValue + myShortValue + myIntValue);

        System.out.println(sum);
    }
}
