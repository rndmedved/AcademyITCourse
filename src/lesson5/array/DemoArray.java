package my.test.array;

public class DemoArray {
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4,5};//1ый вариант создания массива, когда известны значения
        int randomArray[] = new int[10];//2ой способ создания массива. Когда неизвестны значения
        for(int i = 0;i < randomArray.length;i++){
            randomArray[i] = (int) (Math.random() * 10);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();

//        Выведем только четные элементы массива, используя цикл foreach
        for(int item : randomArray){//это цикл foreach. Мы его используем,
//            когда не важен индекс. item - это каждое значение нашего массива
            if (item % 2 == 0){
                System.out.print(item + " ");
            }
        }
    }
}
