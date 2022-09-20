import java.util.Calendar;

public class Part01 {
    public static void main(String[] args) {
        System.out.printf("%d\n", 10);
        System.out.printf("%f\n", 10.1); // double and float data types
        System.out.printf("%c\n", 'a');
        System.out.printf("%C\n", 'a'); // take the character and capitalize it
        System.out.printf("%s\n", "hello");
        System.out.printf("%S\n", "hello");
        System.out.printf("%b\n", 5 < 4); // boolean
        System.out.printf("%B\n", 5 < 4); // capitalize either true or false
        System.out.printf("%b\n", "cow"); // if a non-condition statement is given, it's going to print simply "true"
        System.out.printf("%e\n", 10.123); // scientific notation
        System.out.printf("%E\n", 10.123); // only capitalize the output
        System.out.printf("%g\n", 10000.0); // it can either print in decimal format or scientific notationm format
        System.out.printf("%G\n", 1000000.0); 
        System.out.printf("%o\n", 10); // print data in octal base
        System.out.printf("%x\n", 10); // print data in hexadecimal base
        System.out.printf("%X\n", 10); 
        System.out.printf("%h\n", "hello"); // hash code (print the address)
        System.out.printf("%H\n", "hello"); // hash code
        System.out.printf("%a\n", 10.12); // hexadecimal floating point values
        System.out.printf("%A\n", 10.12); 

        Calendar cal =  Calendar.getInstance();
        System.out.printf("%tB\n", cal); // find different time and different date information, in this particular case we are looking into the calendar to find what's the month
        System.out.printf("%TB\n", cal);
        System.out.printf("%%\n");
    }
}
