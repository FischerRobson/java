# Java

<p align="center">
<img alt="Java" height="200" src="github/java.png" width="200"/>
</p>


- Oriented Programing Language
- Multiplatform (Write only, run anywhere)
- Compiled/Interpreted language`

## JVM

The JVM, or Java Virtual Machine, is a crucial component of the Java platform.
It's responsible for executing Java bytecode, making Java applications 
platform-independent by translating code into machine-specific instructions 
at runtime. This enables "write once, run anywhere" compatibility and
efficient memory management.


![Java](github/java-compile.png)

## JRE x JDK

1. **JRE (Java Runtime Environment)**: It's the environment needed to run Java applications. 
It includes the JVM, class libraries, and essential runtime components,
but doesn't have development tools like compilers.

2. **JDK (Java Development Kit)**: The JDK is for Java developers.
It includes the JRE along with tools like compilers and debuggers, 
allowing programmers to develop and build Java applications.

![Java](github/jre-jdk.png)

## Run Java code

Class must contain `main` method.

```shell
java [Class].java
```

## Primitive Data Types


| Type    | Size    |Description|
|---------|---------| --------- |
| byte    | 1 byte  | Stores whole numbers from -128 to 127 | 
| short   | 2 bytes | Stores whole numbers from -32,768 to 32,767 |
| int     | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| long    | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float   | 4 byte  | 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| double  | 8 byte  | Stores fractional numbers. Sufficient for storing 15 decimal digits |
| boolean | 1 byte  | 	Stores true or false values |
| chat    | 2 byte  | Stores a single character/letter or ASCII values |


