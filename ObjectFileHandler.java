package Day12;

import java.io.*;

public class ObjectFileHandler {

    // Method to write a Person object to a file
    public static void writePersonToFile(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Person object written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing person to file: " + e.getMessage());
        }
    }

    // Method to read a Person object from a file
    public static Person readPersonFromFile(String filename) {
        Person person = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            person = (Person) ois.readObject();
            System.out.println("Person object read from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading person from file: " + e.getMessage());
        }
        return person;
    }

public static void main(String[] args) {
    // Create a Person object
    Person originalPerson = new Person("Alice", 30);

    // Define the filename
    String filename = "person.ser";

    // Write the object to the file
    ObjectFileHandler.writePersonToFile(originalPerson, filename);

    // Read the object back from the file
    Person readPerson = ObjectFileHandler.readPersonFromFile(filename);

    // Print the read object
    System.out.println("Deserialized Person: " + readPerson);
}
}