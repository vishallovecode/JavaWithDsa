abstract class Robot  {

   public void readBook(){
    System.out.println("Robot ios reading a book..");
   }
   public void writeNotes() {
    System.out.println("Robot ios writing  a notes..");
   }
   abstract void makeDinner() ;
   abstract void clearRoom();
   abstract void giveMeStudyalert();
}

class newRobot extends Robot {

    public void makeDinner () {
        System.out.println("Robot is making a dinner for me");
    }

    public void clearRoom () {
        System.out.println("Robot is cleaming..");
    }

    public void giveMeStudyalert () {
        System.out.println("Robot give me alert");
    }

}
public class Abtraction {
    public static void main(String[] args) {
        // Robot rb = new Robot() ; // intatinitae will not happen
        newRobot nr = new newRobot();
        nr.makeDinner();
        nr.clearRoom();
        nr.giveMeStudyalert();
        nr.readBook();
        nr.writeNotes();
    }
}




// I am learning the robotics engineer

// readBook
// writeNotes
// makeDinner
// clearRoom
// giveMeStudyalert
