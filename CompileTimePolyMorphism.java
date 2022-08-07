
class MethodOverloadingExample {

    String defaultName = "User";
    // printName with empty parameter
    public void  printName() {
        System.out.println("My name is:"+ " " + defaultName);
    }
   // printName with one parameter
    public void printName(String name){
        System.out.println("My name is: " + name);
    }

 // printName functions with int data type with one parameter
    public void printPrice(int  price){
        System.out.println("My name is: " + price);
    }
 // printName functions with float data type with one parameter
    public void printPrice(float  price){
        System.out.println("My name is: " + price);
    }


   // printName with two parameter
    public void printName(String name , String lastName) {
        System.out.println("My name is: " + name+ " " + lastName);
    }
 // printName with two parameter
    public void printName(String name , String middleName ,String lastName) {
        System.out.println("My name is: " + name+ " " + middleName+ " " +lastName);
    }

    MethodOverloadingExample() {
        System.out.println("I am constructor");
    }
    MethodOverloadingExample(String name) {
        this.defaultName = name;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // PolyMorphismh
        // MethodOverloadingExample overloading1 = new MethodOverloadingExample();
        MethodOverloadingExample overloading2 = new MethodOverloadingExample("Anonymous");
        overloading2.printName();
        overloading2.printName("Vishal");
        overloading2.printName("vishal" , "sharma");
        overloading2.printName("vishal" ,"joshi", "sharama");

        

    }
}

//  There should be atleast two method with same name to encounter method overloading  => static polyporphism
//  there should be different parameter( number of parameter or type of parameter)






