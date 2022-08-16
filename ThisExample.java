 class Newton  {
    String name  ;
    int mobile ;
    int userId ;
    void printMobile () {
        System.out.println(this.mobile);
    }
    void printBoth () {
        printMobile(); // java by default aise case this
        System.out.println(this.name);
    }
    Newton() {
        System.out.println("I am empty constructor");
    }
    Newton(String name , int mobile) {
       this();
       this.name = name;
       this.mobile = mobile;
       System.out.println("I am 2 paramter constructor");
    }
    Newton(String name , int mobile , int userId) {
        this(name , mobile);
        this.userId = userId;
        System.out.println("I am 3 paramter constructor");

    }
 }

public class ThisExample {
    public static void main(String[] args) {
        Newton new1 = new Newton("vishal" , 991581);
        Newton new12= new Newton("vishal" ,  991581 , 12345);
        System.out.println(new1.name);
        System.out.println(new12.mobile);
        System.out.println(new12.name);
        System.out.println(new12.mobile);
    }
}
