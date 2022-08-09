 class Student  {

    // Private member are not accessible outside the class (where it is defined)

    private int registrationNumber = 12345678; 
    private String mobileNumber  = "917888595486";
    private String fullName = "Vishal Sharma";

    public int getregistrationNumber () {
        return registrationNumber;
    }

    public void setRegisterNumber(int regNo) {
        this.registrationNumber = regNo;
    }

    public String getMobileNo() {
     return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNo) {
        if(mobileNo.length()>=10) {
            this.mobileNumber = "91" + mobileNo;
        } else {
            this.mobileNumber = "Mobile number is not valid";
        }
    }

    public String getFullName() {
         return "Hey " +fullName + " Welcome back";
    }

    public void setFullName(String name){
        this.fullName = name;
    }
}

public class Encapcaulation {
    public static void main(String[] args) {
        Student stu = new Student();
        // Student stu1 = new Student();
        // System.out.println(stu.registrationNumber); it will throw error
        // System.out.println(stu.getregistrationNumber());
        // stu.setRegisterNumber(11607932);
        // System.out.println(stu.getregistrationNumber());
        // System.out.println(stu1.getregistrationNumber());
         System.out.println(stu.getMobileNo());
         stu.setMobileNumber("345678945");
         System.out.println(stu.getMobileNo());
         stu.setMobileNumber("7876876876");
         System.out.println(stu.getMobileNo());
    }
}


// if i will use private access modifier for the data member and thebe method , that data member and method can be 
// only accesible by the own class only it is not accessible outside the class
