Just my personal repo to learn java. <br />

#### Features of JAVA
- Simple
- Object Oriented
- Robust
- Platform Independent
- Secure
- Multi Threading
- Architectural Neutral
- Portable
- High Performance


#### JVM
Java virtual machine that provides runtime environment to execute java byte code. Java files (\*.java) into (\*.class) files which are bytecodes that are understood by JVM. 
A Java program is excution is controlled by JVM.

Java is compiled and interpreted language. During compilation `.java` is converted into `.javac` which is byte code. This byte code cannot be executed on hardware like a complied C code. This byte code needs to be interpreted by JVM during run time to be executed. There java can be called a comile once run anywhere. This makes java platform independent. One one the main disadvantages of compilted languages like C is that the binary code is not platform independent (learn more about this).  

JVM architecture
[JVM Architecture](http://www.studytonight.com/java/component-of-java)

To compile a file run javac `fileName`. filename includes the file extension <br />

After compilation, the class (.class) file  can be run as java `fileName`.

After compilation the `.java` file is converted into byte-code by a compiler. This byte-code is then loaded by the class loader and the following steps are followed:
	` Class-file -> class-loader -> byte-code verifier -> interpreter -> runtime -> hardware`

#### Data Types
2 types of data type:
a. Primitive
b. Non-primitive data types

Primitive data types are divided into 8 types:
`char`, `boolean`, `byte`, `short`, `int`, `long`, `float`, `double`

A primitive data type cannot be changed once declared. But their values can be changed.

These 8 datatypes can be grouped into 4 main groups:
1. Integers
	* Byte => 1 byte Ex: `byte b=10`
	* Short => 2 bytes Ex: `short s=11`
	* Int => 4 bytes Ex: `int i=10`
	* Long => 8 bytes Ex: `long l=10`
2. Floating Point Number
	* Float => 4 bytes Ex: `float ff=10.3f`. Default value is 0.0f
	* Double => 8 bytes Ex: `double db=11.123`. Default value is 0.0d
3. Characters
	* Char => 2 bytes. This is to represent the symbols in character set like numbers and letters.
4. Boolean
	* True
	* False

Non Primitive (reference) data types are to do with Objects. A data type can never be changed.

#### Identifiers
These are the names used for classes, methods, interfaces, and variables

#### Type Casting
Assigning a value of one data type into a variable of different data type is called `Type Casting`

Ex: `int x = 10;
     byte y = (byte)x`

`Widening or Automatic type conversion`
Automatic type conversion are taken place when the two types are compatible with each other and when the target type is larger than the source type.

`byte -> short -> int -> long -> float -> double`

Ex: 
```
     int i = 100;
     long l = i;
```
Here implicit conversion takes place because int data type is smaller than long data type.

`Widening or Explicit conversion`
This is needed when the target data type is smaller than source data type.
Ex: 
```
     double d = 100.04;
     long l = (long)d; // 100
```

#### Variable
Any information in the computer is stored at an address in a computer's memory. This address is complex and hard to remember. Therefore this address is named and this naming is called `variable`. Variable is the memory location in a computer.

There are three types of variables in Java:
	a. Instance variables
	b. Static Variables
	c. Local Variables

#### Instance Variable
Variables that are declared inside a class but outside method, constructor, or block.
Instance variables are also known as object property or field. This property is specific to each object of this class and will not effect the value of this variable even if it is changed by any one of the object.
```
class Student 
{
  String name;
  int age;
}
```

Both name and age are instance variable of the class Student.

#### Static Variable
This variable is declared using a `static` keyword. This is initialized only once. This can also be used to declare a const.
```
class Student
{
  String name;
  int age;
  static int instituteCode = 1101;
}
```
Here instituteCode is a constant will not change. These variables can be called as class variable. This variable will remain const for all the instances of this class. Static variable can be accessed only using its classname and not with the objects (instance) name. Static variable cannot be declared inside an object (local variable).

#### Local Variables  
Local variable are declared in method, constructor, and block. These variables are destroyed once method, constructor, and block are ended. It is created only when methods, constructors, and blocks are initiated. Local variables resides in a stack. Access modifiers are not used for local variables.
```
class Student
{
  float getDiscount (int price)
   {
     float discount;
     discount=price*(20/100);
     return discount;
   }
}
```
Here getDiscount is a method and any variables inside it like discount is a local variable. 

#### Array in Java
Array is a container object that holds similar data types. It is also known as static data stucture because size needs to be declared prior to declaring it.
An array is a primitive or reference type. It's memory is in the heap area (Check JVM Architecture link above to understand this).

#### Array Declaration
datatype[] identifier;
or
datatype identifier[];

```
int[] arr;
char[] arr;
int[][] arr; // two dimensional array
also,
int arr[];
```

*Initialization of an Array*
`new` is used to inititazed an array.

```int[] = new int[10]``` // an empty array with length 10 is created.
or 
```int[] arr = {10, 20, 30, 40};``` // a non empty array with elements specified.

#### Accessing array Elements
Elements of an array can accessed immediately if the know what index value is needed.
ex: `arr[3]` returns 40 from the above array. 
Length of an array can be found as follows `arr.length`

#### foreach or enhanced for loop
This a special type of for loop syntax where items can be accessed without using the index.
Ex.
```
class Test
{
public static void main(String[] args)
  {
    int[] arr = {10, 20, 30};
    for (int x : arr) 
    {
      System.out.println(x);
    }
  }
}
```
Output for above code is `10 20 30`.

#### Multi - Dimensional Array(md)
These types of arrays can have multiple rows and columns.
#### Array Declaration (md)
`datatype[][] identifier;`
or
`datatype identifier[][];`
#### Initialization of Array (md)
`new` operator is used to initialize these arrays
`int[][] arr = new int[10][10];` // 10 by 10 array
or
`int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};` // 3 by 5 array 
#### Accessing array element (md)
`arr[i][j]` // Access element at row i and column j
Ex.
```
int arr[ ][ ] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
System.out.println(arr[1][3]); // This returns 9.
```
#### Jagged Array
This is an array that has unequal size of rows
This array can be initiated with a `new` opetator.
Ex.
```
int[][] arr = new int[3][];
arr[0] = new int[3];
arr[1] = new int[5];
arr[2] = new int[8];
```
#### Operators in Java
	* Arithmatic
	* Relation
	* Logical
	* Bitwise
	* Assignment
	* Conditional
	* Misc

#### Arithmatic
`+, -, *, /, %, ++, --`

#### Relation
`==, !=, <, >, <=, >=`

#### Logical
`&&, ||, !`

Bitwise operators can be applied to integer types like long, int, short, char, and byte

#### Bitwise
`&, |, ^, <<, >>`
```
a	b	a&b	a|b	a^b

0	0	0	0	0
0	1	0	1	1
1	0	0	1	1
1	1	1	1	0
```
Bitwise shift operators is used to shift bit values of a value. Left operand (a) specifies the value to be shifted and right operand (b)
Ex.
```
a = 0001000
b = 2
a << b = 0100000
a >> b = 0000010
```

#### Assignment Operator
`=, +=, -=, *=, /=, %=`

#### Misc Operator
Ternary Operator: `a ? b : c` If `a` is true then take `b` as the value otherwise take `c` as the value.

#### Instance Operator
This operator checks if an object is of a particular type (class type or interface type).

#### OOPS Concepts
#### Features of OOPS
	* Inheritance
	* Polymorphism
	* Encapsulation
	* Abstraction
#### Class
A class is a template or blueprint that describes the behaviors and states of a particular entity. This class can be used to create objects from it and it can be said that objects are instances of aclass. 
A class can contain both data (variables)  and methods (code) that acts on that data. Variables inside a class are callled instance variables. The code that acts on these variables are called as methods. If a class is considered a ice cube tray then ice cubes are objects.

#### Rules of Java Class
	* It can only have public or default(no modifier) access specifier.
	* It can either be abstract, final, and concrete (normal class).
	* It must have a class keyword followed by a legal identifier.
	* It can extend one parent class. By default, it will extend java.lang.Object.
	* It can implement any number of comma-seperated interfaces.
	* Instance variables and methods (members of a class) are declared in a set of `{}` braces.
	* Each `.java` source file can only have one public class. A source file can have any number of default visible classes.
	* The source file name must match the public class name and must have a .java suffix.
Ex. of a class.
```
class Student
{
  String name;
  int rollno;
  int age;
}
```

If the above class is instantiated using `new` then it becomes an object.
Ex.
`Student std = new Student();`
Here `std` is an instance/object of the Student class. The `new` keyword creates an actual copy of the object and assigns it to variable `std`. This will be stored in the heap area of the memory. `new` operator dynamically assigns memory for an object.

#### Initializing a Class
A class can be initiated when an instance of a class is created using a `new` operator.
A class is also initiated when a static method of a class is invoked or a static field of a class is assigned.

#### Copying an entire Java object with its state
`.clone()` method can be used to clone an entire object.

#### Methods in Java
Method describes the behavior of an object.

Ex.
```
public String getName(String st)
{
  String name = 'Clint';
  name += st;
  return name;
}
```
Here,
` public` is the modifier, `String` is the return datatype, `getName` is the method name, and `String st` is the parameter that's passed in when the method is called.

##### Modifier:
Modifier is access type of method.

##### Return datatype:
This is the data type of return value.

##### Method Name:
Name of the method that can be used to call the method (function).

Difference between parameter and argumet:  Parameter is something that is passed into method when defining a method and argument is something that is passed into a function when it is called.
Ex.
```
public void sum(int x, int y) {
  System.out.println(x + y);
};
public static void main(String[] args)
{
  Test b = new Test();
  b.sum (10, 20);
};
```
`sum(int x, int y);` //This is a parameter
and 
`sum(10, 20);` // This is a argument.

Two ways to pass arguments to a method.
 `call-by-value` and `call-by-reference`
#### call-by-value
In this method a copy of an argument is passed into a method and changes made to this argument value inside the method will have no effect on the argument.
Ex.
```
public class Test
{
  public void callByValue(int x)
  {
    x = 100;
  }
  public static void main(String[] args)
  {
    int x = 50;
    Test t = new Test();
    t.callByValue(x);
    System.out.println(x); //50
  }
}
```

#### Call-by-reference
In this call a copy of the argument is passed to a method and any changes made to this value inside the method changes the value of the argument.
### There's no call by reference in Java.

#### Method Overloading
This occurs when 2 or more methods have same name but different parameters in a class. This will happen only when same names are used in same class.

	* One of the ways java supports polymorphism is method overloading.
	* Method overloading can be done by changing the number of arguments or by changing the data type of arguments.
	* Method overloading does not happen when there are same names and parameter but different return type.

##### Over Loaded methods can have different access modifiers.

#### Different ways to implement method overloading
1. Method overloading by changing the data type of arguments
	```
          class Calculate {
              void sum (int a, int b) {
                  System.out.println("Sum is " + (a + b));
              }

              void sum (float a, float b) {
                  System.out.println("Sum is " + (a + b));
              }

              Public static void main (String[] args) {
                  Calculate cal = new Calculate();
                  cal.sum (8, 5); //First sum method with int data type is called.
                  cal.sum (4.6f, 3.5f); // Second sum method with float data type is called.
              }
          }

          // This would output Sum is 13 and Sum is 8.1
	``` 

2. Method overloading by changing the number of arguments

	```
          class Area {
              void find(int l, int b) {
                  System.out.println("Area is " + (l + b));
              }

              void find(int l, int b, int h) {
                  System.out.println("Area is " + (l + b + h));
              }

              Public static void main (String[] args) {
                Area ar = new Area();
                ar.find(8, 5); // First find with 2 parameters
                ar.find(4, 6, 2); // Second find with 3 parameters.
              }

              // This would output Area is 40 and Area is 48.
          }
	```

When java looks for a particular method using it's parameter type and couldn't find an exact match, it'll try finding the method using converting the data type of parameters (type casting). This is shown in the below example.

	```
          class Area {
            void find (long l, long d) {
              System.out.println("Area is " + (l * d));
            }

            void find (int l, int d, int h) {
              System.out.println("Area is " + (l * d * h));
            }

            public static void main (String[] args) {
                Area ar = new Area();
                ar.find(8 * 5);
                ar.find(2, 4, 5):

            /* This will output based on the following algorithm: check for find method with 2 parameters which are long. If that couldn't be found then convert find (int int ) to find (long long). i.e. ar.find (8, 5) is of type find (int int). This will be converted to find (long long) using typecasting. */
            }
          }
	```

#### Constructors in Java
