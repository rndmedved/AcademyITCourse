package lesson11.practice;

public class Task2 {
    public static void main(String[] args) {
        String text = "afdasdf as asd askldf sdlfj";
        char ch = text.charAt(text.length() -2);
        System.out.println(ch);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(ch == text.charAt(i)) count++;
        }
        ;
        System.out.println(count);
    }
}
