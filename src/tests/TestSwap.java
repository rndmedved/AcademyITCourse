package tests;

public class TestSwap {
    public static void main(String[] args) {
        int a= 10;
        int b = 15;
        a +=b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = "+b);
    }
}
