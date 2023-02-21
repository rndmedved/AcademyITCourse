package lesson11.practice;

public class BuilderPrasdnik {
    public static void main(String[] args) {
        String s = "праздник";
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        sb.append((arr[0] + "_").toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if(i < arr.length -1){
                sb.append(arr[i]).append("_");

            } else{
                sb.append(arr[i]).append("!");
            }
        }
        System.out.println(sb.toString());
    }
}
