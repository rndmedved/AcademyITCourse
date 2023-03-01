package lesson13.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("./src/test.txt");
        File file = new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
