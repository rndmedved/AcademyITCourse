package lesson4;

import java.util.Arrays;

//В этом классе реализованы методы, решающие задачи №4, №5 и №6.
public class Task4 {
    public static void main(String[] args) {
        int rows = 3, columns = 4, n=5;
        int[][] test1 = multipleIndexArr(rows,columns);
        int[][] test2 = multipleIndexArr(n);
        System.out.println("Вывод массива " + n + " на " + n);
        printArr(test2);
        System.out.println("\nВывод массива " + rows + " на " + columns);
        printArr(test1);
        System.out.println("\nВывод суммы строк массива " + n + " на " + n);
        printArr(sumRows(test2));
        System.out.println("\nВывод суммы столбцов массива " + n + " на " + n);
        printArr(sumColumns(test2));
        System.out.println("\nВывод суммы строк массива " + rows + " на " + columns);
        printArr(sumRows(test1));
        System.out.println("\nВывод суммы столбцов массива " + rows + " на " + columns);
        printArr(sumColumns(test1));
        System.out.println("\nИтоговый массив, где последная строка и стобец являются суммами строк и столбцов массива " + n + " на " + n);
        printArr(matrix(test2));
        System.out.println("\nИтоговый массив, где последная строка и стобец являются суммами строк и столбцов массива " + rows + " на " + columns);
        printArr(matrix(test1));
    }
    static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i + "\t\t");
        }
        System.out.println();
    }
    static void printArr(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    static int[][] multipleIndexArr(int rowNumber, int columnNumber){
        int[][] result = new int[rowNumber][columnNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                result[i][j] = i*j;
            }
        }
        return result;
    }
    static int[][] multipleIndexArr(int n){
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = i*j;
            }
        }
        return result;
    }
    static int[] sumRows(int[][] inputArr){
        int[] result = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            int sum = 0;
            for (int j : inputArr[i]) {
                sum+=j;
            }
            result[i] = sum;
        }
        return result;
    }
    static int[] sumColumns(int[][] inputArr){
        int[] result = new int[inputArr[0].length];
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                result[j] += inputArr[i][j];
            }
        }
        return result;
    }

    static int[][] matrix(int[][] arr){
        int[] tmpRows = sumRows(arr);
        int[] tmpColumn = sumColumns(arr);
        int[][] result = new int[arr.length+1][arr[0].length+1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if(j < arr[i].length) result[i][j] = arr[i][j];
                else result[i][j] = tmpRows[i];
            }
        }
        for (int i = 0; i < result[result.length-1].length; i++) {
            if (i < tmpColumn.length) result[result.length-1][i] = tmpColumn[i];
            else result[result.length-1][i] =-1;
        }
        return result;
    }
}
