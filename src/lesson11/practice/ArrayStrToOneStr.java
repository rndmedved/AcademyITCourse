package lesson11.practice;

public class ArrayStrToOneStr {
    public static void main(String[] args) {
        String[] arr = {"element1", "element2", "element3"};
        String newString = String.join(";\n", arr);
        System.out.println(newString);
    }
}
