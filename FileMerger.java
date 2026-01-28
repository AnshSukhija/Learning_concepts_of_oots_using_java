package Day11;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class FileMerger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String File1 = "C:\\Users\\dell\\OneDrive\\Desktop\\java\\input.txt";
        String File2 = "C:\\Users\\dell\\OneDrive\\Desktop\\java\\output.txt";
        String File3 = "C:\\Users\\dell\\OneDrive\\Desktop\\java\\Merge.txt";
        try(
        		BufferedReader reader1 =new BufferedReader(new FileReader(File1)); 	
        		BufferedReader reader2 =new BufferedReader(new FileReader(File2)); 
        		BufferedWriter writer =new BufferedWriter(new FileWriter(File3))
        		)
        {
        	String line;
        	while ((line=reader1.readLine())!= null) {
        		writer.write(line);
        		writer.newLine();
        	}
        	while ((line=reader2.readLine())!= null) {
        		writer.write(line);
        		writer.newLine();
        }
        	System.out.println("files merged successfully into"+File3);
	}
        catch (IOException e) {
            System.err.println("Error closing streams: " + e.getMessage());
        }

	}
}
