package Day11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class FileCopier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the path of the source file:");
		String SourceFilePath = sc.nextLine();
		System.out.print("enter the path of the destination file:");
		String destinationFilePath = sc.nextLine();
		File sourcefile = new File(SourceFilePath);
		File destinationFile = new File(destinationFilePath);
		try (FileInputStream fis = new FileInputStream(sourcefile);
			FileOutputStream fos = new FileOutputStream(destinationFile)){
				byte[] buffer = new byte[1024];
				int bytesRead;
				while ((bytesRead = fis.read(buffer))!= -1) {
					fos.write(buffer , 0 , bytesRead);
				}
				System.out.println("filecopiedfrom"+SourceFilePath+"to"+destinationFilePath);
			}
		catch (IOException e) {
			System.err.println("An error occured ehile copying:"+e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
