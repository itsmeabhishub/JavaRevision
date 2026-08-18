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
