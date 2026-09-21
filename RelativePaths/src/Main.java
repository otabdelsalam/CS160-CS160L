import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try
        {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\mormo\\IdeaProjects\\CS160\\RelativePaths\\src\\input.txt");
            Scanner fileReader = new Scanner(inputStream);
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\mormo\\IdeaProjects\\CS160\\RelativePaths\\src\\output.txt");
            PrintWriter fileWriter = new PrintWriter(outputStream);
            while(fileReader.hasNext())
            {
                fileWriter.write(fileReader.nextInt() + 1 + " ");
                fileWriter.flush();
            }
            fileReader.close();
        }
        catch (IOException e) {
            throw new IOException("File cannot be found!");
        }

    }
}