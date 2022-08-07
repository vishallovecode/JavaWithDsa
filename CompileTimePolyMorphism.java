 class Animal  {
    String defaultFavourite = "User";
    public void favouriteDish(){
        System.out.println("Yet to know... ");
    }
    Animal() {
        System.out.println("Constructor");
    }
 }

 class Dog extends Animal {
    String defaultFavourite = "Vishal";
    public void favouriteDish(){
        System.out.println("Fish");
}  

 }

 class Cat extends Animal  {
    String defaultFavourite = "Vishal";
    public void favouriteDish(){
        System.out.println("Bone");
}  
 }

public class Overriding {
    public static void main(String[] args) {
         Animal c = new Cat();
         Dog d = new Dog();
         d.favouriteDish();
         c.favouriteDish();
        //  d.defaultFavourite // this will give you the answer
        //  c.favouriteDish // this will give you the error
    }
}

// Power button laptop , remote , usb

// Dynamic data hiding


// Can we overrride constructor ?

// Can we overload constructor ?



