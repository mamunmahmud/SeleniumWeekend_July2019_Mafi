package keywords;

public class Computer {

   public int ramSize;
   public String computerName;
    public Computer() {

    }

    public Computer(int ramSize) {
        this.ramSize = ramSize;
        System.out.println(ramSize);
    }
    public Computer(String computerName) {
        this.computerName = computerName;

    }
    public void assembleComputer() {

        System.out.println("parts are developed in different countries");

    }


}
