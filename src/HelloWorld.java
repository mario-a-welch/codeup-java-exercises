public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "Java is fun!";
        System.out.println(myString);

//        Will receive an error
//        myString = 'a';
//        System.out.println(myString);


//        Will receive an error
//        myString = 3.14149;
//        System.out.println(myString);

//When printing a variable with no value, you will get back an error stating variable has not been initialized
//        long myNumber;
//        System.out.println(myNumber);

//When assigning a decimal value to long, you will get back incompatible types error: possible lossy conversion from double to long
//        long myNumber = 3.14;
//        System.out.println(myNumber);

// Adding an L at the end of 123 does not return an error, signifies long
//        long myNumber = 123L;
//        System.out.println(myNumber);

//Will compile when run, result in no errors
//        long myNumber = 123;
//        System.out.println(myNumber);

//Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
// 3.14 must be declared as a double or a float because it is a decimal value


//Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14;
//        System.out.println(myNumber);

//Will result in an error, incompatible types: possible lossy conversion from double to float
//        Solve#1
//        double myNumber = 3.14;
//        System.out.println(myNumber);
//        Solve#2
//        float myNumber = 3.14F
//        Solve#3
//        float myNumber = (float)3.14

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
// Outputs 5, then 6

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//Outputs 6, then 6

//Try to create a variable named class. What happens?
//        class codeup = 'c';
//Creating a variable of class will result in an error


//Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//Error: java.lang.String incompatible with java.lang.Integer at java.base/java.lang.ClassCastException.

//        int three = (int) "three";
//Error: incompatible types: java.lang.String cannot be converted to int

//        int x = 4;
//        x = x + 5;
//        x+=5;  //Shorthand assignment
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y*=x; //Shorthand assignment
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y;
        x/=y; //Shorthand assignment
//        y = y - x;
        y-=x; //Shorthand assignment
        System.out.println(x);
        System.out.println(y);


    }
}
