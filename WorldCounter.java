package Day10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class WorldCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Filep = "C:\\Users\\dell\\OneDrive\\Desktop\\java\\Merge.txt";
		int wordcount = countWordsInFile(Filep);
		System.out.println("Total words in the file:"+wordcount);
	}
	public static int countWordsInFile(String Filep) {
		int count = 0;
		try(BufferedReader reader = new BufferedReader (new FileReader(Filep))){
			String line;
			while ((line=reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word:words) {
					if (!word.trim().isEmpty()) {
						count++;
					}
				}
			}
		}
		catch (IOException e) {
            System.err.println("Error closing streams: " + e.getMessage());
		}
		return count;
	}

}
