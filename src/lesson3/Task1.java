package lesson3;

public class Task1 {
    /**
     * простые числа до 100.
     * @param args
     */
    public static void main(String[] args) {
        simpleNumbers3(100);
    }
    static void simpleNumbers3(int n){
        boolean isSimpleNumber = true;
        for (int i = 2; i <= n; i++) {
            for(int j = 2; j <= Math.round(Math.sqrt(i)); j++){
                if(i % j == 0){
                    isSimpleNumber = false;
                    break;
                }
            }
            if (isSimpleNumber) System.out.printf("%d\t", i);
            isSimpleNumber = true;
        }
    }
}
