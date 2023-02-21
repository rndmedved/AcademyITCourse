package lesson3;

public class Task4 {
    /*
    20 строк вида #
     */
    public static void main(String[] args) {
        int i = 0;
        String stringOut = "#";
        while(i < 20){
            System.out.println(stringOut);
            stringOut = stringOut.concat("#");
            i++;
        }
    }
}
