//Create a class having a copy constructor, add a method to check & return whether two objects of the class are equal or not
 class MyClass {
    int x;
    String y;

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

    // Method to check whether two objects are equal
     boolean isEqual(MyClass obj) {
        if (this.x == obj.x && this.y.equals(obj.y)) {
            return true;
        } else {
            return false;
        }
    }
}


class Main {
    public static void main(String[] args) {
MyClass obj1 = new MyClass(10, "Hello"); //parmetrized constructor
MyClass obj2 = new MyClass(obj1); // Copy constructor

obj1.display(); // Output: x: 10, y: Hello
obj2.display(); // Output: x: 10, y: Hello

if (obj1.isEqual(obj2)) {
    System.out.println("The two objects are equal.");
} else {
    System.out.println("The two objects are not equal.");
}

}
}