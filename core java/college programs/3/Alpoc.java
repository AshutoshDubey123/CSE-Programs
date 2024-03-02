//create a class with data members & call all possible types of constructors so as to implement constructor overloading 
//Use a display methos to demostrate the calling of each type of constructor
 class MyClass {
    int x;
    String y;

    // Default constructor
    MyClass() {
        x = 0;
        y = "default";
    }

    // Parameterized constructor
    MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    MyClass(MyClass obj) {
        x = obj.x;
        y = obj.y;
    }

    // Display method
     void display() {
        System.out.println("x: " + x + ", y: " + y);
    }
}

 class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Default constructor
        MyClass obj2 = new MyClass(10, "Hello"); // Parameterized constructor
        MyClass obj3 = new MyClass(obj2); // Copy constructor

        obj1.display(); // Output: x: 0, y: default
        obj2.display(); // Output: x: 10, y: Hello
        obj3.display(); // Output: x: 10, y: Hello
    }
}


