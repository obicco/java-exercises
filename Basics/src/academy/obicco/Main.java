package academy.obicco;

public class Main {
    public static void main(String[] args) {

        int number_1 = 10 + 5;

        // 8bits
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("BYTE - 8 bits\nThe minimum byte value is " + minByteValue + "\nThe maximum byte value is " + maxByteValue);
        System.out.println("Busted MAX value = " + (maxByteValue + 1) + " --> This is an overflow");
        System.out.println("Busted MIN value = " + (minByteValue - 1) + " --> This is an underflow\n");

        //16bits
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("SHORT - 16 bits\nThe minimum short value is " + minShortValue + "\nThe maximum short value is " + maxShortValue);
        System.out.println("Busted MAX value = " + (maxShortValue + 1) + " --> This is an overflow");
        System.out.println("Busted MIN value = " + (minShortValue - 1) + " --> This is an underflow\n");

        //32bits
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("INTEGER - 32 bits\nThe minimum integer value is " + minIntValue + "\nThe maximum integer value is " + maxIntValue);
        System.out.println("Busted MAX value = " + (maxIntValue + 1) + " --> This is an overflow");
        System.out.println("Busted MIN value = " + (minIntValue - 1) + " --> This is an underflow\n");

        //64bits
        long number_2 = 100L; //put at the end 'L' to show that is a long value
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("LONG - 64 bits\nThe minimum long value is " + minLongValue + "\nThe maximum long value is " + maxLongValue);
        System.out.println("Busted MAX value = " + (maxLongValue + 1) + " --> This is an overflow");
        System.out.println("Busted MIN value = " + (minLongValue - 1) + " --> This is an underflow\n");
    }

}