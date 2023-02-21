package lesson11.strTest;

public class ArrayCharsToString {
    public static void main(String[] args) {
        char[] ch = {55, 56 ,57, 67 , 68};
//        valueOf позваляет преобразовывать массивы в строку
        System.out.println(String.valueOf(ch, 1, 2));
        String s = new String(ch , 1 ,3);
        System.out.println(s);
        char[] ch1 = s.toCharArray();
//        Преобразование символа в строку
        char x = 'a';
        String strX = x + "";
        String strX2 = String.valueOf(x);
        String strX3 = Character.toString(x);

        //получение отдельного символа из строки

        String test =  "test";
        System.out.println(test.charAt(0));
    }
}
