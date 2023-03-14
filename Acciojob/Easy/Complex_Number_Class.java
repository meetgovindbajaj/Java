/**
@start--------------------------------------------

@param Question
A Complex Number class contains two data members : one is the real part and the other is imaginary .

Implement the complex Numbers class that contains the following functions-

Constructor- You need to create the appropriate constructor.

Plus- This function adds two given complex numbers and updates the first complex number.

e.g.

  if c1 = 4+i5 and c2 = 3+i1
  c1.plus(c2) results in : 
  c1 = 7+i6 and c2 = 3+i1

Multiply- This function multiplies two given complex numbers and updates the first complex number.

e.g.

   if c1 = 4+i5 and c2 = 1+i2
   c1.multiply(c2) results in : 
   c1 = -6+i13 and c2 = 1 +i2

Print- This function prints the given complex number in the following format:

 a + ib

Note:- Input has been handled in the driver code. You need to complete ComplexNumbers() Class.


@param Input-Format
The first line of the input contains two integers - the real and imaginary part of 1st complex number.

The second line of the input contains two integers - the real and imaginary part of 2nd complex number.

The third line of the input contains an integer representing choice ,

Choice = 1 , Plus
Choice = 2 , Multiply


@param Output-Format
The only line of the output prints the complex number in the given format.


@param Input
4 5
6 7
2


@param Output
-11 + i58


@param Explaination
c1 = 4 + i5 
c2 = 6 + i7 
c3 = c1 * c2 => -11 + i58


@param Constraints
-100 <= real , imaginary <= 100

Choice = 1 or 2

@end--------------------------------------------
*/


import java.util.*;

public class Complex_Number_Class {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int real1 = sc.nextInt(), imaginary1 = sc.nextInt(), real2 = sc.nextInt(), imaginary2 = sc.nextInt(),
                choice = sc.nextInt();
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        if (choice == 1)
            c1.plus(c2);
        else if (choice == 2)
            c1.multiply(c2);
        c1.print();
    }
}

class Complex {
    int real, imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void plus(Complex c) {
        real += c.real;
        imaginary += c.imaginary;
    }

    void multiply(Complex c) {
        int x = (real * c.real) - (imaginary * c.imaginary);
        imaginary = (real * c.imaginary) + (imaginary * c.real);
        real = x;
    }

    void print() {
        System.out.println(real + " " + (imaginary < 0 ? "-" : "+") + " i" + Math.abs(imaginary));
    }
}
