package Assessment_3;
import java.io.*;
public class Question2 {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile = "output.txt";
        try (FileWriter fw = new FileWriter(sourceFile)) {
            fw.write("This is sample data from input file.\nLine 2: Java I/O example.");
        } catch (IOException e) {
            System.out.println("Error creating input file: " + e.getMessage());
            return;
        }
        try (FileInputStream fis = new FileInputStream(sourceFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream(destFile);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            int byteData;
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }
            System.out.println("Data copied successfully from " + sourceFile + " to " + destFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(destFile))) {
            System.out.println("\nContent of output file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading output: " + e.getMessage());
        }
    }
}