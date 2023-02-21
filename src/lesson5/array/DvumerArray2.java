package my.test.array;

public class DvumerArray2 {
    public static void main(String[] args) {
        int size = 5;
        int mas[][] = new int[size][size];

        for(int i = 0;i < mas.length;i++){
            for(int j = 0;j < mas[i].length;j++){
                mas[i][j] = i * j;
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
