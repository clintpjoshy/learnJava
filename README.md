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
	** Class-file -> class-loader -> byte-code verifier -> interpreter -> runtime -> hardware**

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
Assigning a value of one data type into a variable of different data type is called **Type Casting**

Ex: `int x = 10;
     byte y = (byte)x`

**Widening or Automatic type conversion**
Automatic type conversion are taken place when the two types are compatible with each other and when the target type is larger than the source type.

`byte -> short -> int -> long -> float -> double`

Ex: `int i = 100;
     long l = i;`
Here implicit conversion takes place because int data type is smaller than long data type.

**Widening or Explicit conversion**
This is needed when the target data type is smaller than source data type.
Ex: `double d = 100.04;
     long l = (long)d; // 100`

#### Variable
Any information in the computer is stored at an address in a computer's memory. This address is complex and hard to remember. Therefore this address is named and this naming is called `variable`. Variable is the memory location in a computer.

There are three types of variables in Java:
	a. Instance variables
	b. Static Variables
	c. Local Variables

#### Instance Variable
Variables that are declared inside a class but outside method, constructor, or block.
Instance variables are also known as object property or field. This property is specific to each object of this class and will not effect the value of this variable even if it is changed by any one of the object.
`
class Student 
{
  String name;
  int age;
}`

Both name and age are instance variable of the class Student.

#### Static Variable
This variable is declared using a `static` keyword. This is initialized only once. This can also be used to declare a const.
`
class Student
{
  String name;
  int age;
  static int instituteCode = 1101;
}`
Here instituteCode is a constant will not change. These variables can be called as class variable. This variable will remain const for all the instances of this class. Static variable can be accessed only using its classname and not with the objects (instance) name. Static variable cannot be declared inside an object (local variable).

#### Local Variables  
Local variable are declared in method, constructor, and block. These variables are destroyed once method, constructor, and block are ended. It is created only when methods, constructors, and blocks are initiated. Local variables resides in a stack. Access modifiers are not used for local variables.
`
class Student
{
  float getDiscount (int price)
   {
     float discount;
     discount=price*(20/100);
     return discount;
   }
}`
Here getDiscount is a method and any variables inside it like discount is a local variable. 

#### Array in Jave
Array is a container object that holds similar data types. It is also known as static data stucture because size needs to be declared prior to declaring it.
An array is a primitive or reference type. It's memory is in the heap area.

*Array Declaration*
datatype[] identifier;
or
datatype identifier[];

`
int[] arr;
char[] arr;
int[][] arr; // two dimensional array
also,
int arr[];

*Initialization of an Array*
`new` is used to inititazed an array.

int[] = new int[10] // an empty array with length 10 is created.
or 
int[] arr = {10, 20, 30, 40}; // a non empty array with elements specified.

*Accessing array Elements*
Elements of an array can accessed immediately if the know what index value is needed.
ex: `arr[3]` returns 40 from the above array. 
Length of an array can be found as follows `arr.length`

#### foreach and enhanced for loop ####

