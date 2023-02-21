package my.test.array;

public class Chess {
    public static void main(String[] args) {
//        char c[] = {'a','b','c','d','e','f','g','h'};
//        for (var i = 8; i > 0; i--) {
//            for(var item : c) {
//               System.out.print(Character.toString(item) + i + "\t");
//            }
//            System.out.println();
//        }
//        for (char c = 'a'; c <= 'h'; c++) {
//            System.out.println(c);
//        }

//        2ой вариант
        for (int i = 8; i > 0; i--) {
            for (char c = 'a'; c <= 'h'; c++) {
                System.out.print(Character.toString(c) + i + "\t");
            }
            System.out.println();
        }
    }
}
