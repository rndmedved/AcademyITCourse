package lesson11.practice;

public class TaskFinal {
    public static void main(String[] args) {
        String str = "Иван заработал 9888 рублей, Игрь - 6584 рубля," +
                " а Мария 17895 рублей";
        int sum = 0;

        String[] strArr = str.split(",");
        for (String s : strArr) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                if((int)s.charAt(i) >= 48 && (int) s.charAt(i) <= 57){
                    result = result.concat(s.charAt(i)+"");
                }
            }
            System.out.println(result);
            if(!result.equals("")) {
                sum += Integer.parseInt(result);
            }
        }
        System.out.println(sum);

    }
}
