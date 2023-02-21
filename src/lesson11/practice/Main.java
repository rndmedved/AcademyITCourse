package lesson11.practice;

public class Main {
    public static void main(String[] args) {
        String s = "Праздник";
        char[] ch = s.toCharArray();
        s="";
        for (int i = 0; i < ch.length-1; i++) {
            s = s.concat(ch[i]+"_");
        }
        s = s.concat(ch[ch.length-1]+"");
        System.out.println(s);
    }
}
