/*WAP in java to create an interface. Demonstrate the fact that all the methods declared in the interface must be defined in a class that implemnts 
the interface, otherwise the class should be declared as abstract .*/  

// Define an interface named MyInterface
interface MyInterface {
    // Declare a method without a body
    void myMethod();
void anotherMethod();
}

// Create a class that implements the interface
class MyClass implements MyInterface {
    // Implement the method defined in the interface
    public void myMethod() {
        System.out.println("This is the implementation of myMethod.");
    }

    /* You can add additional methods in this class
    public void anotherMethod() {
        System.out.println("This is another method in MyClass.");
    }*/
}

 class Main {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call the implemented method
        obj.myMethod();

        // Call the additional method in MyClass
       // obj.anotherMethod();
    }
}

/*1b.java:12: error: MyClass is not abstract and does not override abstract method anotherMethod() in MyInterface
class MyClass implements MyInterface {
^
1 error*/
