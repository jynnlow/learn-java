public class Main {
    public static void main (String[] arg){
        /*printf() - two parameters :- format string + (object/variable/value)
        * FORMAT SPECIFIERS %
        * sequence: [flag] [width] [precision] [conversion-character]
        *
        * 1. Conversion-character - datatype
        * %d - decimal - int
        * %c - char
        * %s - string
        * %b - boolean
        * %f - float & double
        *
        * 2. Width
        * - minimum number of characters to be written as output
        *
        * 3. Precision
        * - set number of digits of precision when outputting floating-point numbers
        *
        * 4. Flag
        * - add an effect to output based on the flag added to format specifier
        * - : left-justify
        * + : output a (+) or (-) sign for a numeric value
        * 0 : numeric values are zero padded
        * , : comma grouping separator if number > 1000
        * */

        //example of 1. conversion character
        System.out.println("----------conversion character----------");
        System.out.printf("This is the format string + decimal value = %d", 123);
        System.out.println("\n");

        //example of 2. width
        System.out.println("-----------------width------------------");
        System.out.printf("Width 10 -%10s.", "Jynn"); //Width 10 -      Jynn.
        System.out.println("\n");

        //example of 3. precision
        System.out.println("----------------precision---------------");
        System.out.printf("Two decimal point: %.2f", 3.12345); //Two decimal point: 3.12
        System.out.println("\n");

        //example of 4. flag
        //1. - : left-justify
        System.out.println("------------------flag------------------");
        System.out.printf("Left-justify: %-10s.", "Jynn"); //Left-justify: Jynn      .
        System.out.println("\n");

        //2. - : output a (+) or (-) sign for a numeric value
        System.out.printf("Plus sign: %+f \n", 3.12345);
        System.out.printf("Minus sign: %+f", -3.12345);
        System.out.println("\n");

        //3. numeric values are zero padded - filled with zeros
        System.out.printf("Zero padded: %020f \n", 12345.6); //0000000012345.600000
        System.out.printf("Zero padded: %020f", 12345.123456); //0000000012345.123456
        System.out.println("\n");

        //4. comma grouping separator if number > 1000
        System.out.printf("Comma: %,f", 12345.6); //12,345.600000
        System.out.println("\n");

        System.out.println("-------------all in example-------------");
        // [flag-0] + [flag,0]+ [width-20] + [precision-.1] + [conversion-character-f]
        System.out.printf("Everything combined: %0,20.1f", 12345.123456); //00000000000012,345.1
    }
}
