Just my personal repo to learn java. <br />
This is based of http://www.studytonight.com/java/overview-of-java.

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
A Java program's execution is controlled by JVM.

Java is compiled and interpreted language. During compilation `.java` is converted into `.javac` which is byte code. This byte code cannot be executed on hardware like a complied C code. This byte code needs to be interpreted by JVM during run time to be executed. There java can be called a 'compile once run anywhere'. This makes java platform independent. One one the main disadvantages of compiled languages like C is that the binary code is not platform independent (learn more about this).  

JVM architecture
[JVM Architecture](http://www.studytonight.com/java/component-of-java)
(Check in the image folder for JVM Architecture representation).

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
class Test{
  public static void main(String[] args) {
    int[] arr = {10, 20, 30};
    for (int x : arr) {
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
   a    |    b    |   a&b   |   a|b   |   a^b
------- | ------- | ------- | ------- | -------
   0    |    0    |    0    |    0    |   0
   0    |    1    |    0    |    1    |   1
   1    |    0    |    0    |    1    |   1
   1    |    1    |    1    |    1    |   0
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
Here, ` public` is the modifier, `String` is the return datatype, `getName` is the method name, and `String st` is the parameter that's passed in when the method is called.

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

#### Constructors in Java
Constructor is a special method that is used to initialize an object. Every class has a constructor. When creating a class if a constructor is not defined, java compiler creates one for us by default. There is not need for a return type on constructor method. A constructor should have same name as the class. The modifier type for a constructor cannot be abstract, static, final or syncronized.

Ex for a class:

```
class Car() {
  String name;
  String model;

  Car() {
    name = "";
    model = ""'
  }
}
```

2 types of Constructors
	* Default
	* Parameterized
When a new object is created at least one constructor will be invoked.
```
Car c = new Car() // Default
Car c = new Car(name); // Parameterized
```

#### Constructor Overloading
Same as methods, constructors can be overloaded as well. Overloaded constructors are differentiated based on the type of parameters or number of parameters. This is same as method overloading except that a constructor wouldn't return any type in java.

The reason for constructor overloading is to create object in different ways.

Ex:
```
class Cricketer {
  String name;
  String team;
  int age;

  Cricketer() { // default constructor
    name = "";
    team = "";
    age = 0;
  }

  Cricketer(String n, String t, int a) { // constructor overload.
    name = n;
    team = t;
    age = a;
  }

  Cricketer(Cricketer ckt) { // This is same as constructor copy in c++
    name = ckt.name;
    team = ckt.team;
    age = ckt. age;
  }

  public String toString() {
   return "this is " + name + " of " + team;
  }

  class test {
    Cricketer c1 = new Cricketer();
    Cricketer c2 = new Cricketer("Sachin", "India", 32);
    Cricketer c3 new Cricketer(c2);

    System.out.println(c2);
    System.out.println(c3);

    c1.name = "Virat";
    c1.team = "India";
    c1.age = 32;

    System.out.println(c1);
  }
}
```

Difference between constructors and methods are as follows: 
Constructors should have same name as the class. They also do not return a value. They are also called only once when a object is instatiated.
Methods on the other hand can be called multiple times and it can return a value or just be a void method.

Constructor Chaining in Java:
Calling a constructor to a different constructor in the same class. 

Constructor return the current instance of a class. It'll not have any return type.

#### this keyword
`this` is used with four different ways in java.
* It refers the current object.
* It refers to the object on which the method was invoked.
* Can be used to invoke current class constructor.
* can be passed as an argument to another method.

Ex.
```
class Box {
  Double width, height, depth;
  Box (double w, double h, double d) {
    this.width = w;
    this.height = h;
    this.depth = d;
  }
}
```
Here `this` is used to initialize a variable (member) of current object. Here it refers to the current object that invoked the constructor.

*Overload a constructor*
```
class Car {
  private String name;
  public Car () {
    this('BMW');  //overloading the constructor
  }
  public Car (String n) {
    this.name = n; //Member of the class is initialized. (same a above)
  }
}
```

*Call methods of a class*
```
public void getName () {
  System.out.println('study');
}

public void display () {
  this.getName();
  System.out.println();
}
```

*Return current object*
```
public Car getCar () {
  return this;
}
```

#### Garbage Collection
In java, if an object is not references anymore, memory assosiated with that object can be retrieved and this is done automatically by JVM. This technique is gabace collection.
Languages like C++ and C, these objects that are not referenced needs to be explicitly garbage collected to prevent `Memory Leaks`.

There no explicit garbage collection in java. JVM can be requested to garbage collect using `System.gc()` method. There is no gaurentee that this method will garbage collect.

*finalize()*
This method is used to run any specific tasks like closing a connection etc to be done when an object is destroyed. This method is called by the garbage collection thread before an object is garbage collected. This will be the last chance to clean up tasks.

Ex.
```
protected void finalize() {
  //finalize tasks
}
```
This method is available for all classes. It also used `protected` modifier.

*gc()*
This is the method that is used to garbage collect explicitly like discussed before. But this method does not gaurantee garbage collection. This method only can request JBM for garbage collection.

Ex.
```
public class Test {
  public static void main(String[], args) {
    Test t = new Test();
    t = null;
    System.gc();
  }

  public void finalize() {
    System.out.println("Garbage Collected");
  }
}
```

#### Modifiers
Modifiers are certain keywords that are used to change what a variable, class, constructor etc name means. Thery are 2 categories of modifiers.
* Access Control Modifier
* Non Access Modifier

#### Access Control Modifiers
There are 4 access control modifers that are used for classes, variables, and constructors.
* Default: Elements with default in their name has scope only in the same package.
* Public: Public keyword in variable etc name will make it visible everywhere.
* Protected: These elements will be available in the package and any subclasses.
* Private: These elements have scope only within classes that the elements are defined.

Like the name defines, these keywords will control where a variable can be accessed and available.
(Check in image folder for image representing the access modifiers).

#### Non-Access Modifiers
These modifiers, do not affect the accessibility of the variables and methods. They provide special properties to the variables and methods. There are 5 different types non access modifiers like:
* Final
* Static
* Transient
* Synchronized
* Volatile

**Final**
A variable, or such entities with a `final` modifier it's contents are prevented from being modified. This can be used when declaring a variable, method, or a class.

*Final Variable*
Here a variable behaves like a constant because it's value cannot be changed.
`final int a = 5;`

*Final Method*
The method cannot be overridden in the future.

```
class StudyTonight {
  final void learn() {
    System.out.println("learning");
  }
}

class Student extends StudyTonight {
  void learn() {
    System.out.println("learning something new");
  }

  public static void main(String args[]) {
    Student object = new Student();
    object.learn();
  }
}
```
The above code will error because `StudyTonight` is declared with a `final` modifier. Like above, a method can be inherited but it cannot be overriden.

*Final Class*
A class with final modifier cannot be inherited unlike a method.

**Static**
Static Modifiers can be used to create class methods and class variables that can be accessed without an instance of a class.

*Static Variable*
A static variable that is declared in a class can be accessed without instantiating an object of that class.
A static variable is stored at only one location. This means that every instance of object created from a single class will always have the same static variable that is declared in the class. This also means that static variables are initialized only once.
A common property that has to be a part of all the object instances can be declared using static modifier. This saves memory. As an example, when creating a class that declares the properties of all the employees, employee name, id etc are unique but company name is same for all of them and therefore static modifier can be used.

Ex.
```
class Employee {
  int e_id;
  String name;
  static String company_name = 'MyComapany';
}
```

```
class St_Employee {
  int eid;
  String name;
  static String company_name = "MyCompany";

  public void show() {
    System.out.println(eid + " " + name + " " + company_name);
  }

  public static void main(String[] args) {
    St_Employee se1 = new St_Employee();
    se1.eid = 111;
    se1.name = "Clint";
    se1.show();

    St_Employee se2 = new St_Employee();
    se2.eid = 123;
    se2.name = "Clint1";
    se2.show();
  } 
}
```

**Static Variable VS Instance Variable**
```
Static variable                    | Instance variable
---------------                      ------------------
Represent common property          | Represent unique property
Accessed using class name          | Accessed using object
Get memory only once               | get new memory each time a new object is created
```

Ex.
```
public class Test {
  static int x = 100;
  int y = 100;

  public void increment () {
    x++;
    y++;
  }

  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();
    t1.increment();
    t2.increment();
    System.out.println(t2.y); //101
    System.out.println(Test.x); // Here a static variable can be accessed even without instantiating an object. Directly from the class itself. 102
  }
}
```
From the second println it can be seen that the value is updated as well. Thus even though we are accessing the variable x, it's value is updated because of the instantiation that happened at t1 and t2.

**Static Method**
A method can be declared as static as well. This method can be accessed without instantiating it's class. One of the examples of such a method that is commonly used is `main()` method. This method is declared as static because it's called before any object is created from a class.

```
class Test {
  public static void square(int x) {
    System.out.println(x*x);
  }

  public static void main(String[] args) {
    square(8); //static method square () is called without any instance of the class Test
  }
}
```

**Static Block**
Static block, can be used to initialize a data set as shown in the example below. Static blocks are executed before `main()` method.

```
class St_Employee {
  int eid;
  Sting name;
  static String company_name;

  static {
    company_name = "MyCompany"; //Static block invoked before main() method
  }

  public static void main(String [] args) {
    St_Employee se1 = new St_Employee();
    se1.eid = 111;
    se1.name = 'name';
    se1.show();
  }
}
```

Non Static variables cannot be referenced from a static context.
This happens because non static variables are available only after an object is instantiated by a `new` operator. But static variable are available even before a class is instantiated. Therefore non static variables cannot be accessed inside a static context. In static context, non static context variables or entities are not yet available.

```
class Test {
  int x;
   public static void main(String[] args) {
    x = 10;
   }
}
```
This code will output a compile error `non-static variable cannot be referenced from a static context`

Accessing a non static variable inside a static method:
```
class Test {
  int x;

  public static void main(String[] args) {
    Test tt = new Test();
    tt.x = 10; // This will work because the class is instantiated and therefore non static variables are available.
  }
}
```
`main()` method is static and therefore can be called without any instances of classes.

**Transient Modifier**
When this modifier is applied to a field in java, that field with this attribute will be excluded when the object is being serialized. When the object is deserialized, the field will be initialized with its default value (null value for a reference type or zero / false if the object is a primitive type).

**Synchronized Modifier**
A synchronized method can be accessed by only one thread at a time. This method will prevent thread interference and memory consistency error as follows: if an object is visible to more than one thread, all reads or writes to that object done through synchronized methods.

**Volatile Modifier**
Volatile modifier can be changed unexpectedly by other parts of your program. This volatile variables can be used for multi threading program. This can be used only on a variable and not on a class or method.

#### Inheritance (IS-A)
Inheritance is a feature where a class can inherit properties and methods of another class. When a class extends another it inherits all the non private properties and methods. Inheritance happens from parent (**super class**) to child (**sub class**).

Inheritance in java defines a **is\-a** relationship between Super and sub classes ie. a sub class is a child of a super class.

**extends** and **implements** are 2 main keywords used for inheritance in java.

**implements** is something that is used to create a **interface** from a class and will be discussed in the interface section later.

Using **extends**:
Ex.

```
class Vehicle {
 //code
} 

class Car extends Vehicle {
  //code
  //this class will also have properties (non private) from Vehicle class
}
```
In this case **Vehicle** is a **Super Class** of **Car** and **Car** is a **Sub Class** of **Vehicle**.
Also Car **IS\-A** Vehicle.

Inheritance has many advantages:
* Code reusability. Methods and properties that can be common among many children class and can be reused.
* It also helps is creating polymorphism by allowing method overriding.

Inheritance also has many disadvantages:
* Parent and Child are tightly coupled.
* That means that any changes to parent class will result in changes in child classes and therefore they cannot be independent to each other.

Ex:
```
class Parent {
  public void p1() {
    System.out.println("parent method");
  }
}

public class Child extends Parent {
  public void c1() {
    System.out.println("Child method");
  }
  public static void main(String[] args) {
    Child cobj = new Child();
    cobj.c1(); //method of Child class
    cobj.p1(); //method of Parent class
  }
}
```

Another example:
```
class Vehicle {
  String vehicleType;
}
public class Car extends Vehicle {
  String modelType;

  public void showDetails() {
    vehicleType = "Car"; //this type is defined in parent class
    modelType = "Sports";
    System.out.println(modelType + " " + vehicleType);
  }

  public static void main(String[] args) {
    Car car = new Car();
    car.showDetatils();
  }
}
```

#### Types of Inheritance
1. Single Inheritance
2. Multilevel Inheritance (Not supported in java)
3. Heirarchial Inheritance

**Single Inheritance**
`Class A ------> Class B`

**Multilevel Inheritance**
`Class A ------> Class B ------> Class C`
This is not suported in java. I think javascript supports this (confirm this).

**Heirarchial Inheritance**
```
          Class A
           /\
          /  \
         /    \ 
        /      \
    Class B  Class C

```

Multilevel Inheritance can result in ambiguity and therefore can cause confusion to developers.

####Super Keyword
This keyword is used to represent the immediate parent class of a class. So a sub class uses super to represent it's immediate parent (super class).

```
class Parent {
  String name;<---------------------
}                                  |
                                   |
class Child Extends Parent {       |
  String name;<-----------------   |
                               |   |
  void detail() {              |   |
    super.name = "Parent";-----|----
    name = "Child";-------------
  }
}
```

Ex: Child class refering to a parents property using super
```
class Parent {
  String name;
}

public class Child extends Parent {
  String name;
  public void details() {
    super.name = "parent"; // Refers to parent
    name = "child"; // Refers to child
    System.out.println(super.name + " " + name);
  }
  public static void main(String[] args) {
    Child cobj = new Child();
    cobj.details();
  }
}
```
Output will be:
`Parent and Child`

Ex: Child class refering to parent method using super
```
class Parent {
  String name;
  public void details() {
    name = "parent";
    System.out.println(name);
  }
}

public class Child extends Parent {
  String name;
  public void details() {
    super.details(); //Calling the method from parent
    name = "child"; // Refers to child
    System.out.println(name);
  }
  public static void main(String[] args) {
    Child cobj = new Child();
    cobj.details();
  }
}
```
Output will be:
```
parent
child
```
Ex: Child class calling parent class constructor using super
```
class Parent {
  String name;
  public Parent(String n) {
    name = n;
  }
}

public class Child extends Parent {
  String name;

  public Child(String n1, String n2) {
    super(n1); // passing argument to parent class constructor
    this.name = n2;
  }

  public void details() {
    System.out.println(super.name + " and " + name);
  }

  public static void main(String[] args) {
    Child cobj = new Child("Parent", "Child");
    cobj.detail(); // Parent and Child
  }
}
```

**Note:** When calling a parent class constructor from the child class using `super` keyword, `super` keyword should be the first line in the method/constructor of the child class.

**Super Class reference point to Sub class object** 
When class B extends from class A.
`A a = new B()` is a correct syntax because of `IS-A` relationship between A and B.

**Note:** We cannot use both this() and super() in a constructor. Because both of them needs to be the first statement inside a constructor.

#### Aggregation (HAS-A)
HAS-A relationship is based on usage and not based on inheritance. Class A has-a relationship with class B, if code in class A has a reference to an instance in class B.

Ex.
```
class Student {
  String name;
  Address ad;
}
```

Here Student has-a **Address**.

```
Student
name
Address ----------------> Address
                          city
                          zip
```
What it means is that student class has an instance of variable type Address. Student class can use Address behaviour without repeating the code.

Aggregation helps in designing good object oriented design and code reusability.

```
class Author {
  String authorNmae;
  int age;
  String place;
  Author(String name, int age, String place) {
    this.authorNmae = name;
    this.age = age;
    this.place = place;
  }

  public String getAuthorName() {
    return authorName;
  }

  public int getAge(){
    return age;
  }

  public String getPlace() {
    return place;
  }
}

class Book {
  String name;
  int price;
  Author auth;
  Book(String n, int p, Author at) {
    this.name = n;
    this.price = p;
    this.auth = at;
  }

  public void showDetail() {
    System.out.println("Book is " + name);
    System.out.println("price is " + price);
    System.out.println("Author is " + auth.getAuthorNmae());
  }
}

class Test {
  public static void main(String[] args) {
    Author ath = new Author("Me", 22, "India");
    Book b = new Book("Java", 559, ath);
    b.showDetails();
  }
}
```

Output
```
Book is Jave.
price is 550.
Author is me.
```
It can be seen from above code, how Author defined in Author class is available in class Book.

#### Composition
Composition is restricted Aggregation. When one class that owns another class is destroyed the other class cannot exist meaningfully. This is known as composition.

Ex;
```
class Car {
  private Engine engine;
  Car(Engine en) {
    engine = en;
  }
}
```
Here class Car cannot exist without class Engine.

When to use Inheritance and Aggregation in Java?
When a property needs to be used without modifying it in different class then **Aggregation** maybe used. When a property needs to be modified in a different class in order to modify certain property or method then **Inheritance** is a better option.

#### Method Overriding
This is also called as **runtime polymorphism**. When a sub class has same name, same number of arguments and same type of signature as method in its super class, then the method is known as **Overriden Method**. Benefit of Method overriding is that a method can be modified to match the properties of that sub class.

Method Overloading is the way where java uses it's intelligence to detemine which method to be used based on number of argumets and data type etc. Method Overriding means replacing the method to match the requirements of a specific class.

Ex:
```
class Animal {
  public void eat() {
    System.out.println("Generic Animal eating");
  }
}

class Dog extends Animal {
  public void eat() { //eat() method overriden by Dog class.
    System.out.println("Dog eat meat");
  }
}
```

Even though eat method is in the super class of Dog, it's overriden by eat method in Dog class. Method must have same name and same type signature to be overridden otherwise it's overloading.

**Note:** Static methods cannot be overridden because, a static method is bounded by a class but a instance method is bounded with an object.

#### Covariant Return Type
A method can be overriden by changing its return type. If a subclass overrides a method by changing the return type of super class method, then the return type of the overridden method must be a subtype of return type declared in the original super class. 

```
class Animal {
  Animal myType() {
    return new Animal();
  }
} 

class Dog extends Animal {
  Dog myType() { //override
    return new Dog();
  }
}
```

#### Difference between Overloading and Overriding

```
Method Overloading               |             Method Overriding
------------------                             -----------------
Parameter must be different but  |  Both name and parameters must be same
not the name.

Compile time polymorphism        |  Runtime Polymorphism

Increase readability of code     |  Increase reusability of code

Access specifier can be changed  |  Access specifier cannot be more restrictive
                                    than original method (can be less restrictive)
```
**Note:**
We cannot override a static method because static methods are bound to a class and overriding is associated to the object (instance of class) and this happens at runtime.


#### Runtime Polymorphism or Dynamic method dispatch

This is a process where a overriden method is resolved at runtime. When a overriden methed is called by a reference, java determines which method (with same name) needs to be executed base on the type of the object it refers to. Therefore type of method detemines the method to be called.

#### Upcasting and Downcasting
(later)

**Difference between Static binding and Dynamic binding**
Static binding occurs during compile time and dynamic binding happens during runtime. Static binding uses class and dynamic binding uses instance of class (object). Overloaded methods use Static binding while overriden methods use dynamic binding.

#### Instanceof Operator
`instanceof` operator can be used to check the type of a object at runtime. This operator is also important for casting of an object at runtime.

```
public class Test {
  public static void main(String[] args) {
    Test t = new Test();
    System.out.println(t instanceof Test); //true
  }
}
```
#### Command line arguments in java
This section explains how command line can be used to run java programs and how arguments can be passed to functions from command line.

Arguments passed in command-line are stored as string in **String** array passed to the args parameter passed to `main()` method.

```
class cmd {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
```
The above code can be executed in cmd as follows:
`java cmd 10 20 30`

#### Java Package
Packages are important in java because they can avoid name conflicts and to control access of class, interfacr, and enumeration etc. In a package similar types of classes, interface, enumeration, or sub-package are grouped together.

Types of packages.
**Built-in:** packages provides by java such as `java.lang`, `java.util` etc.
**User-defined** Packages created by grouping similar classes, interfaces etc.

**Creating a package**
If a package needs to be created it can be done simply by adding `package myPackageName` in the first line of the code.

Ex:
```
package myPackage;

public class employee {
  //code
}
```

Any files that are created under this package are stored under `myPackage` folder / directory.
Some important points about packages
* Package is defined as seperate folder and has the same name as the package.
* Stores all the classes beonging to this package under this folder
* Any classes that needs to be accessed outside of this package should be declared as public accessor
* All the classes within the package must have package statement as the first line
* All the classes in a package must be compiled before use to be error free.

**Compiling Programs in Java Packages**
If compiling from a terminal then following statements needs to be run when compiling programs in packages.
`javac -d directoryName fileName`
Ex:
`javac -d . FirstProgramName.java`
In the above case directoryName isn't given instead just a `.`. This is done when we want the compiled  class file needs to be saved to the same directory. If it needs to be save in another directory then path to that directory needs to be given.
`-d` flag specifies the destination.

**How to run Java package program**
A file in the package can be compiled as above. In order to run this compiled class file package name needs to be added as well.
Ex.
`java myPackage.FirstProagram`

**Import Keyword**
Packages, both user defined and native can be imported to other pakages using `import` keyword.

There are three ways to access class belonging to different packages to current class.
1. Using fully qualified name (Not a good practice)
Ex.
Consider 2 packages pack and myPack.
```
package pack;
public class A {
  public void msg() {
    System.out.println("Hello");
  }
}
```
And myPack
```
package myPack;
class B {
  public static void main(String args[]) {
    pack A obj = new pack.A(); // Using fully qualified name
    obj.msg();
  }
}
```
If we want only one particular class of a package then it can be accessed as shown above. In this way other classes with same name in the current package will not be accessed. In this method there's no need for `import` statement. This method is not recommended and can be used when 2 packages have classes with same name. Ex `java.util` and `java.sql` packages contain `Date` class.

2. Import class or class that are only needed.
We can do something like `packageName.className` to get the class `className` from `packageName` in our current class.
Ex.
```
package pack;
public class A {
  public void msg() {
    System.out.println("Hello");
  }
}
```

 And

```
package myPack;
import pack.A;
class B {
  public static void main(Stirng args[]) {
    A.obj = new A();
    obj.msg(); //Hello
  }
}

3. Import all the classes from a package.
If a whole package with it's classes and interfaces needs to be imported that can be done as follows.

```
package learnjava;
public class First {
  public void msg() {
    System.out.println("Hello");
  }
}
```
And
```
package studyJava;
import learnJava.*;
class Second {
  public static void main(String args[]) {
    First obj = new First();
    obj.msg(); // Hello
  }
}
```

Important points to remember about packages:
1. If package is not specified, it classes are added to default package which is the current working directory and it doesn't need a name.
2. Package statement should be written in the beginnig of the line.

//wrong way
```
import package p1.*;
package p3;
```

//Correct way
```
package p3;
import package p1.*;
```

#### Sub Package and Static Import in Java
A package inside of a package is called subpackage.

Using Java as an example, java itself is a package that contains many classes like System, string, Reader, Writer etc depending on it's use cases. Each class can be grouped into further subpackages like net, io etc. So Input/ Output classes can be found in io and server / serverSocket related classes can be found in net package.

Ex:
```
package LearnJava.Package.SubPackage;
class Simple {
  public static void main(String args[]) {
    System.out.println("Hello subpackage"); // Hello subpackage
  }
}
```

This can be compiled as `javac -d . Simple.java`.
This can be run as `java LearnJava.Package.SubPackage.Simple`

**Static Import**
Static members of a class can be imported using **static import**. If we want to access a static member outside of a class without using class name then static import is used. 

There are 2 ways to import a static member.
1. Import a particular static member from a class
Ex. `import static package.className.staticMemberName;`
    `import static java.lang.Math.sqrt;` 

2. Import all the static members of a class
Ex. `import static package.classTypeName.*;`
    `import static java.lang.Math.*;` //Import all the static classes.

Ex. using static and not using static import

```
// Without static
public class Test {
  public static void main(String[] args) {
    System.out.println(Math.sqrt(144)); //12
  }
}
```

```
//With static
public class Test {
  public static void main(String[] args) {
    System.out.println(sqrt(144)); //12
  }
}
```

**Abstraction** in computer science can be understood as preserving information that are relevent in a given context and forgetting all the other ones that are not relevent in a specific context.

#### Abstract Class
If a class contain any abstract method then the class is declared as an abstract class.
An abstract class is never instantiated. This class will not provide complete abstraction because it can also have concrete methods.

Ex.
`abstract class className{}`

**Abstract Method**
Method that are declared without any body in an abstract class is called abstract method. Subclasses will be responsible to define an abstract methods body. Abstract method cannot have final and static modifiers. If a class extends an abstract class then all the abstract methods needs to be implemented by the extended class

Ex. `abstract returnType functionName();` // No body

Ex. Abstract class
```
abstract class A {
  abstract void callMe();
}

class B extends A {
  void callme() {
    System.out.println("this is callme");
  }

  public static void main(String[] args) {
    B b = new B();
    b.callme(); //  this is callme
  }
}
```

**Abstract class with concrete(normal) method.
Like discussed above an abstract class can also have concrete (normal) methods as well along with abstract methods.

```
abstract class A {
  abstract void callme();

  public void normal() {
    System.out.println("this is a concrete method");
  }
}

class B extend A {
  void callme() {
    System.out.println("this is callme.");
  }

  public static void main(String args[]) {
    B.b = new B();
    b.callme(); //this is callme.
    b.normal(); //this is concrete method
  }
}
```

**Points to Remember**
1. Abstract classes are not the same as interfaces.
2. An abstract class do not need to have an abstract method. But if any method is declared as abstract in a class then that class needs to be declared as abstract.
3. Abstract classes can have Constructors, Member variables, and Normal methods
4. Abstract classes are never instantiated.
5. When a abstract class is extended, any abstract method in that class needs to be defined in the child class.

**Abstraction using abstract class**
Abstraction means to hide complexity. Like discussed its a way to use what is needed for at a certain context. Following is an example of how abstract classes can be used for abstraction.

```
abstract class Vehicle {
  public abstract void engine();
}
public class Car extends Vehicle {
  public void engine() {
    System.out.println("Car Engine"); //abstract method implementation
  }

  public static void main(String[] args) {
    Vehicle v = new Car();
    v.engine();
  }
}
```
In this case we are hiding the complexity of Car under Vehicle. See that in main method we are instantiating an instance of Car v which is of the type Vehicle (I think this is upcasting. Learn more...). The abstract method engine is implemented in Car but we are hiding that implementation.

**When to use Abstract Methods and Classes**
Abstract methods are usually used when 2 or more subclasses would do somehting similar but it is done in different ways with different implementation. Each subclasses will define the implementation in the way it's wanted in that class.

Abstract classes on the other hand are used to provide generic types of behaviors at the top of oop class hierarchy and it's subclasses will provide the details of abstract class.

####Interface
Interface can be called a pure abstract class. They syntatically similar to classes. But an instance of these classes cannot be created. Also their methods are declared without any body. A complete abstraction is possible using interface. 

`interface interface_name {}`

Ex:
```
interface Moveable {
  int AVERAGE-SPEED = 40;
  void move();
}
```
When an interface as above is declared the compiler converts a method as `public` and `abstract` and data members as `public`, `static`, and `final`.

```
//This is what the compiler converts an interface into
interface Movabel {
  public static final int AVERAGE-SPEED = 40;
  public abstract  void move();
}
```
**Rules for using Interfaces**
1. Methods inside Interface must not ve static, final, native or strictfp.
2. All variables inside interface are implicitly public static final variables (constants).
3. All methods inside interface are implicitly public and abstract.
4. Interface can extend one or more other interfaces.
5. Interface cannot implement a class.
6. Interface can be nested inside another interface.

Ex:
```
interface Moveable {
  int AVG-SPEED = 40;
  void move();
}

class Vehicle implements Moveable {
  public void move() {
    System.out.print in ("Average speed is " + AVG-SPEED);
  }

  public static void main(String[] args) {
    Vehicle vc = new Vehicle();
    vc.move();
  }
} 
```

**Interfaces supports Multiple Inheritance**
Though classes in java doesn't support multiple inheritance, a class can implement more than one interfaces.

Ex:
```
interface Moveable {
  boolean isMovable();
}

interface Rollable {
  boolean isRollable();
}

class Tyre implements Moveable, Rollable {
  int width;

  boolean isMovable() {
    return true;
  }

  boolean isRollable() {
    return true;
  }

  public static void main(String args[]) {
   Tyre tr = new Tyre();
   System.out.println(tr.isMoveable()); //true
   System.out.println(tr.isRollable()); //true
  }
}
```
**Interfaces extends other Interfaces**
Classes implements an Interface but an interface can extend other interfaces.

```
interface NewsPaper {
  news();
}

interface Magazine extends NewsPaper {
  colorful();
}
```
**Difference between an interface and an abstract class**
```
Abstract Class                          | Interface
------------------------------------------------------------------------------------
Abstract class is a class that contians | Interface contains only method declaration
more than on abstract methods. Abstract | but no implementation. Classes that
methods are implemented by subclasses   | implement interfaces must provide method
                                        | definition.
                                        |
Abstract class is declared with a       | Interface is a pure abstract class.
abstract keyword                        | It starts with a interface keyword. 
                                        |
Abstract class can contain concrete     | It can only have abstract methods and
mehtods                                 | final variables
                                        |
These are useful when we need some      | These are useful where all the 
general classes that needs to be        | properties needs to be implemented
implemented with specialized behavior   |
by subclasses
```
#### Nested Class
A class can be defined in another class and this is called nested classes. Scope of a nested class is bounded by it's enclosing class.

Ex:
```
class Outer {
  class Inner {
  }
}
```

Advantages of Nested classes.
1. Logically group  classes that are used at one place.
2. Encapsulation.
3. Readable and maintainable code.

2 types of Nested Classes.
**Static Nested Class**
If a inner class has static modifier applied to it then it's called **static nested class**. If the inner class is a static member, it can only access static members of it's outer class.

**Non Static Nested class**
This is the most important among nested classes. It is also known as **Inner Class**. It can access all the variables and methods of the outer class including it's private members and methods and can refer to them directly. But Outer class cannot access members of the inner class. Inner class can be declared private, public, protected, or with default access. But outer class can be only public or default access.

An inner class can only be created within the scope of a outer class. Java compiler generates an error if inner class is instantiated outside of an outer class.

A non static nested class that is created outside a method is called **Member inner class**.

A non static nested class that is created inside a method is called **local inner class**. If a  mehtod inside a local inner class needs to be called then this class needs to be instantiated inside this method. Only abstract and final access modifiers can be used with local inner class.

Ex: Inner class (Member class)
```
class Outer {
  public void display() {
    Inner in = new Inner();
    in.show();
  }

  class Inner {
    public void show() {
      System.out.println("Inside inner");
    }
  }
}

class Test {
  public static void main(String[] args) {
    Outer ot = new Outer();
    ot.display(); // Inside inner
  }
}
```

Ex: Inner class inside a method(local inner class)
```
class Outer {
  int count;
  public void display() {
    for(int i = 0; i < 5; i++) {
      class Inner {
        public void show() {
          System.out.println("Inside inner " + (count++));
        }
      }
      Inner in = new Inner();
      in.show();
    }
  }
}

class Test {
  public static void main(String[] args) {
    Outer ot = new Outer();
    ot.displey();
  }
}
```

Output is:
 ```
Inside inner 0
Inside inner 1
Inside inner 2
Inside inner 3
Inside inner 4
```

Ex: Inner class instantiated outside Outer class
```
class Outer {
  int count;
  public void display() {
    Inner in = new Inner();
    in.show();
  }

  class Inner {
    public void show() {
      System.out.println("Inside inner " + (++count));
    }
  }
}

class Test {
  public static void main(String[] args) {
    Outer ot = new Outer();
    Outer.Inner in = ot.new Inner();
    in.show(); // Inside inner 1
  }
}
```

**Annonymous class**
A class without a name is called Annonymous class.
```
interface Animal {
  void type();
}

public class Atest{
  public static void main(String args[]) {
    Animal an = new Animal() { //Annonymous class created
      public void type() {
        System.out.println("Annonymous animal");
      }
    }
    an.type();
  }
}
```
In this case an interface Animal is implemented by creating a class and the name of the class is decided by the compiler. This annonymous class can be used to implement the type method.
