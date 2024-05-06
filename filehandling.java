import java.io.File;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        System.out.println("File exists: " + file.exists());
        
        try {
            System.out.println("File created: " + file.createNewFile());
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }

        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("File name: " + file.getName());
        System.out.println("Parent directory: " + file.getParent());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Is readable: " + file.canRead());
        System.out.println("Is writable: " + file.canWrite());
        System.out.println("File deleted: " + file.delete());
    }
}
