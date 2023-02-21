package lesson8.HomeTask;

/**
 * Доделать как у Сергея. Пока не выполнил
 *
 */
public class DivisionByZero {
    public static void main(String[] args) {
        double d[] = {0,2,3,4,5,6,7,8,9,};
        double j[] ={0, 3,4,5,6,7,0,4,3};
        int iterator = 0;
        double result = 0;

        for (double v : d) {
            try {
                result = v / j[iterator];
                if (Double.isFinite(result)) {
                    throw new ArithmeticException("На ноль делить нельзя");
                }

            }catch (ArithmeticException e){}
            System.out.println(result);
            iterator++;
        }

    }
}
