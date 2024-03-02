/*
Create a class Complex for storing the real and imaginary part of a complex number. The class should gave static members to store the number of complex numbers created and display it.Write fucntions(static or non- static as required) to calculate 
1. sum, difference and product of two complex numberes, 
2. modulus and complement of a complex number
Define required constructors and destructors of the class.
Implement the class by a main functions */



class Complex {
    double real;
    double imag;
    static int count = 0;

    Complex(double r, double i) {
        real = r;
        imag = i;
        count++;
    }

    Complex() {
        real = 0;
        imag = 0;
        count++;
    }

    static int getCount() {
        return count;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    static Complex add(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }

    static Complex subtract(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real - c2.real;
        temp.imag = c1.imag - c2.imag;
        return temp;
    }

    static Complex multiply(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = (c1.real * c2.real) - (c1.imag * c2.imag);
        temp.imag = (c1.real * c2.imag) + (c1.imag * c2.real);
        return temp;
    }

    double modulus() {
        return Math.sqrt((real * real) + (imag * imag));
    }

    void complement() {
        imag *= -1;
    }

}

 class Main {

    public static void main(String[] args) {

        // Creating objects of the class
        Complex num1 = new Complex(3.5, 4.5);
        Complex num2 = new Complex(4.5, 5.5);

        // Displaying the complex numbers
        System.out.print("First complex number: ");
        num1.display();
        System.out.print("Second complex number: ");
        num2.display();

        // Calculating and displaying the sum of two complex numbers
        System.out.print("Sum of two complex numbers: ");
        Complex sum = Complex.add(num1, num2);
        sum.display();

        // Calculating and displaying the difference of two complex numbers
        System.out.print("Difference of two complex numbers: ");
        Complex difference = Complex.subtract(num1, num2);
        difference.display();

        // Calculating and displaying the product of two complex numbers
        System.out.print("Product of two complex numbers: ");
        Complex product = Complex.multiply(num1, num2);
        product.display();

        // Calculating and displaying the modulus of a complex number
        System.out.println("Modulus of first complex number: " + num1.modulus());

        // Calculating and displaying the complement of a complex number
        System.out.print("Complement of first complex number: ");
        num1.complement();
        num1.display();

       // Displaying the total number of complex numbers created
       System.out.println("Total number of complex numbers created: " + Complex.getCount());
   }
}
