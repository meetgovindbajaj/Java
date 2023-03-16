/**
@start--------------------------------------------

@param Question
Add a call to Pet’s brag method before printing anything in Dog’s brag method.

It should print “I have the best pet!” and then “I have the best dog”.

Complete the given Dog''s class :

class Dog extends Pet{
    
    public void brag(){
        
        System.out.println("I have the best dog!");
    }
}

Task :

Complete the code in your editor by writing some code so that it prints the required output.


@param Input-Format
There is no input.


@param Output-Format
When executed, your completed code should print the following:

I have the best pet!
I have the best dog!


@param Input
None


@param Output
I have the best pet!
I have the best dog!


@param Explaination
None


@param Constraints
None

@end--------------------------------------------
*/


public class Pet_Dog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.brag();
    }
}

class Pet {
    void brag() {
        System.out.println("I have the best pet!");
    }
}

class Dog extends Pet {
    void brag() {
        super.brag();
        System.out.println("I have the best dog!");
    }
}
