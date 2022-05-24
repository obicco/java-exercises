package academy.obicco;

public class Main {
    public static void main(String[] args) {

        int number_1 = 10 + 5;

        //8bits
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
        long number_2 = 100L; //put at the end 'L' to identify that is a long value
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("LONG - 64 bits\nThe minimum long value is " + minLongValue + "\nThe maximum long value is " + maxLongValue);
        System.out.println("Busted MAX value = " + (maxLongValue + 1) + " --> This is an overflow");
        System.out.println("Busted MIN value = " + (minLongValue - 1) + " --> This is an underflow\n");

        byte byte_1 = (byte) (minByteValue / 2); //Casting adaptable to all data types other than int because it's the default one

        //FLOAT - Single precision number occupies 32 bits
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("FLOAT - 32 bits\nThe minimum float value is " + minFloatValue + "\nThe maximum float value is " + maxFloatValue + "\n");

        //DOUBLE - Double precision number occupies 64 bits | Prefer to use nowadays than float
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("DOUBLE - 64 bits\nThe minimum double value is " + minDoubleValue + "\nThe maximum double value is " + maxDoubleValue + "\n");

        //CHAR 16bits because of unicode characters
        char myChar = 'D';
        char unicodeChar = '\u0044'; //Unicode that stands for char D
        char myCopyRight ='\u00A9';

        System.out.println("Standard char: " + myChar);
        System.out.println("Unicode char: " + unicodeChar);
        System.out.println("Unicode symbol: " + myCopyRight + "\n");

        //BOOLEAN allows true/false or yes/no or 1/0
        boolean trueValue = true;
        boolean falseValue = false;

        boolean isCustomerOverTwentyOne = true; //Example of use and naming

        //STRING - datatype Class
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more"; //adding text to string variable
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("My string is equal to " + myString + "\n");
        //If you add an int to a String, Java automatically adds it as a text
        //Strings are immutable, when I add something a new String is created and the old one is discarded from memory

        //CONDITIONAL LOGIC
        boolean isAlien = false;

        if (!isAlien)
            System.out.println("It is not an alien!");
        else System.out.println("It's an alien");


        int topScore = 80;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) { //AND Operator
            System.out.println("You got the high score!");
        }

        if (topScore > 90 || topScore <= 90) { //OR Operator
            System.out.println("Either or both of the conditions are true");
        }

        //TERNARY OPERATOR
        boolean isCar = false;
        boolean wasCar = isCar ? true : false; //First (isCar == true) is the condition, assigns the second operator if it's ture or the third one if it's false, like for if/then/else
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }

}