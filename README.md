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
	a. Byte => 1 byte Ex: `byte b=10`
	b. Short => 2 bytes Ex: `short s=11`
	c. Int => 4 bytes Ex: `int i=10`
	d. Long => 8 bytes Ex: `long l=10`
2. Floating Point Number
	a. Float => 4 bytes Ex: `float ff=10.3f`. Default value is 0.0f
	b. Double => 8 bytes Ex: `double db=11.123`. Default value is 0.0d
3. Characters
	a. Char => 2 bytes. This is to represent the symbols in character set like numbers and letters.
4. Boolean
	a. True
	b. False

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
