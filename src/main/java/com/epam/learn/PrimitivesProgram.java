package main.java.com.epam.learn;

public class PrimitivesProgram {
    public static void main(String[] args) {
        //Integer literals
        byte var1 = -35; //decimal number - 8 bits
        short var2 = 0b1011; //binary number (introduced in Java 7) - 16 bits
        int var3 = 0x51b; //hexadecimal number - 32 bits
        int var4 = 071; //Octal number - 32 bits
        long var5 = 12345L; //decimal number - 64 bits
        long var6 = 0xffffL; //hexadecimal number - 64 bits
        //instead of:
        int var7 = 7000000;
        //You can write:
        int var8 = 7_000_000;

        //Floating-point literals
        //With a fixed point:
        double var9 = 1.618; //64 bits
        //In exponential form (floating point):
        double var10 = -0.112E-05; //64bits
        //literal of the type float, after the last digit use the character F or f as a suffix:
        float var11 = -18.456F; //32 bits
        //special values were introduced
        // to describe infinity (+Infinity and –Infinity) and the value NaN (Not a Number, uncertainty)

        //Boolean (logical) statements
        boolean flag = true; // usually - 8 bits

        //Character literal - 16 bits or 2 bytes where:
        //first byte contains the code of the control character or alphabet
        //second byte corresponds to the specification of the character in the standard of the ASCII code
        //As a character in single quotation marks:
        char ch1 = '3';
        char ch2 = 'g';
        char ch3 = '(';
        //As a character code in the hexadecimal number system:
        char ch4 = '\u0034';
        char ch5 = '\u002e';
        //Special escape characters:
        char ch6 = '\t'; //tabulation
        char ch7 = '\n'; //new line
        char ch8 = '\r'; //transition to the beginning of the current line
        char ch9 = '\b'; //backspace

        //String literals
        //A special area is allocated in the heap for exclusive storage of string literals
        // called a string pool

        //String literals are NOT basic data, but objects of the class String.

        //A string literal may NOT end with the character '\0',
        // since this is NOT A STRING in the format of the ASCII-code,
        // but an object consisting of a set of characters.
        String str = "Text";
        System.out.println("Hello");
        //string concatenation (consolidation), which is indicated by the + sign.
        // This operation adds a string representation of another object
        // at the end of the initial string object:
        int number = 100;
        String str1 = "Value";
        System.out.print(str1 + " number " + number + '\n');

        //Keyword var
        var x = 10; //int
        var i = Integer.valueOf(2); //Integer
        var str2 = "java"; //String
        //var needs to be initialized at declaration
        //var x; //you will get a compilation error.
        //х = 10;
    }
}
