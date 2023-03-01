package lesson13.practice;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/lesson13/practice/matrix");
        Scanner scanner = new Scanner(file);
        String output = "";
        int iter = 0;
        while (scanner.hasNextLine()){
            iter++;
            String[] s = scanner.nextLine().split(",");
            for (String s1 : s) {
                output+=(int) (Math.pow(Integer.parseInt(s1.trim()),iter)) + ",\t";

            }
            output+="\n";
        }
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("\n" + output);
        fileWriter.flush();
    }
}
