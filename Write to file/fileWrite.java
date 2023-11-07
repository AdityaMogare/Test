import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Aditya\\Udemy Java\\SaExp5\\src\\output.txt");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write("Hello! How are you today?");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
