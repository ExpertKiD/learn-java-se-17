public class Casting {


    public static void main(String[] args) {
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myNewByteMinValue =  (byte)(myMinByteValue /2); // result is an int, so need to cast
    }
}
