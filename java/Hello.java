public class Hello() {
  public static void main(String[] args) {
    System.out.println("Hello");
  }
};

/**
* What different keywords means?
**/
// class => Keyword to declare class in Java
// public => This means it is visible and accessible by everyone
// static => This means that an Object of the class need not be created. The main method called by jvm without creating an object for the class
// void => This means that the function will not return anything
// main => the method is executed and all the logic should be in this method. Not having this method will cause a compilation error.
// String[] args => The parameter is an array with strings as the elements in the array. args is the name of the array.
// System.out.println => This is the command used to print the output (console.log in js)

// This code is compiled as `javac Hello.java`
// This code after compilation can be run as follows ` java Hello`// This will return the output on the console
