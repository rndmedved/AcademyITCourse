package lesson14.complexityю;

public class TestDifficult {
    /**
     * O(1)
      */
    int getValue(int mas[], int index){
        return mas[index];
    }
    int getSum(int[] arr){
        int s = 0;
        for (int i : arr) {
            s+=i;
        }
        return s;
    }
}
