// Camelcasing
// class and interface :- Clac, Runable => start capital
                      => if we want our cannot inherit by other class we can use final keyword to prevent
//variables and methods :- age, show(); => always lower case
                    => final keyword help us to make variables unchangable && samw with method also we can prevent method overriding by using final keyword
//constant:- PIE, BRAND => always uppercase
//constructor Human()


//maximum time we use camelcasing like showMyTicket

//package in java is like our folder in computer to accumulate the similar thing at a place


Access modifer in java is keyword that help to define from where a class, variables, methods or constructor can be access.

                                          Public          Private        Protected        Default


Same class                                 YES             YES            YES              YES


Same package sub class                     YES              NO            YES              YES


Same package non-sub class                 YES              NO            YES              YES


Different package sub class                YES              NO            YES              NO


Different package non-sub class            YES              NO             NO              NO




                                                  POLYMORPHISM
  ONE THING MANY FORM


Two type of polymorphism
1) compile time polymorphism - method overloading
2) run time polymorphism - method overriding

                                                  OBJECT CLASS

Object class in java is the root or parent class of all classes


class A {
}

java internal see like this

class A extends Object {
}

Some commonly used method in from object class

equals()
hashcCode()
toString()
getClass()


                                              TYPECASTING

We can change type of primitive vale like if we have value in double we can change into int

double x = 10.05

int y = (int) x;

this is premitive type conversion

now we will look into class/ object type casting
so basically we can do two type of type casting:- upcasting from child to parent and downcasting from parent to child

                                                WRAPPER CLASSES

Wrapper classes are class in java that provide an object reperesentation of primitive data type

int x = 10; // primitive data type
Integer y= 10;  //wrapper classes

Autoboxing:- Changing primitive data type to wrapper classes automatically

int a = 10;

Integer b = a; //behind the scene the primitive data type change into wrapper classes

int => Integer;
float => Float
double => Double


                                                ABSTRACT KEYWORD

Abstract class is class whose object cant be created, and its purpose is to provide base class which can be used by its child class do the thing as per his requirement, in abstract class we have abstract method and normal method too.


Abstract method we can just define it and later child class can use as per his requirement.



                                                  INNER CLASS

Inner class in java is defined inside another class. 

class A{

int a = 10;

  class B{
    int b = 10;
  }

}
