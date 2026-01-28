package Day4;

//Interface
interface MountainParts {
 // Constant
 String TERRAIN = "off-road";

 // Abstract methods
 String getSuspension();
 void setSuspension(String newValue);

 String getType();
 void setType(String newValue);
}

//Class implementing interface
class MountainBike implements MountainParts {
 // Instance variables
 private String suspension;
 private String type;

 // Constructor
 MountainBike(String suspension, String type) {
     this.suspension = suspension;
     this.type = type;
 }

 // Implementing interface methods
 @Override
 public String getSuspension() {
     return suspension;
 }

 @Override
 public void setSuspension(String newValue) {
     this.suspension = newValue;
 }

 @Override
 public String getType() {
     return type;
 }

 @Override
 public void setType(String newValue) {
     this.type = newValue;
 }

 // Method to display details
 void display() {
     System.out.println("Terrain: " + TERRAIN);
     System.out.println("Suspension: " + suspension);
     System.out.println("Type: " + type);
 }
}

//Main class
public class Interface {
 public static void main(String[] args) {
     // Create object
     MountainBike bike = new MountainBike("Dual", "Downhill");

     // Display details
     bike.display();

     // Update values using setters
     bike.setSuspension("Front");
     bike.setType("Cross Country");

     System.out.println("\nAfter updating values:");
     bike.display();
 }
}
