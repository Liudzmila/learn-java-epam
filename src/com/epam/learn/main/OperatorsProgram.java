package com.epam.learn.main;

public class OperatorsProgram {
    public static void main(String[] args) {
        //Operators are special commands informing the translator that you wish to perform an operation.
        //Operands are the data that are subject of the operation.

        //Arithmetic operators:
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b  = " + (a + b)); //infix binary - Adds the values on both sides of the operator.
        System.out.println("a - b  = " + (a - b)); //infix binary - Subtracts the right operand from the left one.
        System.out.println("a * b  = " + (a * b)); //infix binary - Multiplies the values on both sides of the operator.
        System.out.println("b / a  = " + (b / a)); //infix binary - The operator divides the left operand
                                                    // by the right operand (or divides evenly for integers).
        System.out.println("b % a  = " + (b % a)); //infix binary - Divides the left operand by the right operand
        System.out.println("c % a  = " + (c % a)); // and returns the remainder.
        System.out.println("a++    = " +  (--a)); // Decrement – decreases the value of the operand by 1.
                                                    //It has a prefix form. - Prefix Unary
        System.out.println("a--    = " +  (a--)); //Decrement – decreases the value of the operand by 1.
                                                    //It has and a postfix form. - Postfix Unary
        System.out.println("d++    = " +  (d++)); //Increment – increases the value of the operand by 1.
                                                    //It has a postfix form. - Postfix Unary
        System.out.println("++d    = " +  (++d)); //Increment – increases the value of the operand by 1.
                                                    //It has a prefix form. - Prefix Unary
        System.out.println("a += b = " + (a += b)); //a = a + b
        System.out.println("a      = " + (a)); //
        System.out.println("a -= b = " + (a -= b)); //a= a - b
        System.out.println("a      = " + (a)); //

        //Bitwise operators:
        a = 60;
        b = 13;
        System.out.println("a & b   = " + (a & b)); // 12  = ... 0000 1100
        System.out.println("a | b   = " + (a | b)); // 61  = ... 0011 1101
        System.out.println("a ^ b   = " + (a ^ b)); // 49  = ... 0011 0001
        System.out.println("~a      = " + ~a); // -61 = 1111 1111 1111 1111 1111 1111 1100 0011
        System.out.println("a << 2  = " + (a << 2)); // 240 = ... 1111 0000
        System.out.println("a >> 2  = " + (a >> 2)); // 15  = ... 0000 1111
        System.out.println("a >>> 2 = " + (a >>> 2)); // 15  = ... 0000 1111

        //Comparison operations (true or false)
        a = 10;
        b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        //Logical operators (true or false) - examples: a && b; a || b; !(a && b) !a; instanceof
        String name ="EPAM";
        boolean result = name instanceof String;
        System.out.println(result);

        //Ternary operator "?:"
        int experience = 5;
        int requirements = 10;
        String result1 = (experience > requirements) ? "Accept to project" : "Learn more" ;
        System.out.println( result1 );


        System.out.println(010 | 4);//010 Octal number because there is 0 before, 010 = 8, not 10 (or 1010),
        // so 010 = 8 = 1000 and 4 = 0100, 1000 | 0100 = 1100 = 12
    }
}