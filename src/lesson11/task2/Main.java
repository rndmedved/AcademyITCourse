package lesson11.task2;
//Дано предложение. Необходимо проверить его на наличие
//ошибок в буквосочетании «жи» и «ши» и исправить их.
public class Main {
    public static void main(String[] args) {
        String sentence = "Жы жы жЫ ЖЫ шы шы Шы фывафыв ждодлфывао";
        sentence = sentence.replaceAll("Жы", "Жи");
        sentence = sentence.replaceAll("жЫ", "жИ");
        sentence = sentence.replaceAll("ЖЫ", "ЖИ");
        sentence = sentence.replaceAll("жы", "жи");
        sentence = sentence.replaceAll("шы", "ши");
        sentence = sentence.replaceAll("Шы", "Ши");
        sentence = sentence.replaceAll("шЫ", "шИ");
        sentence = sentence.replaceAll("ШЫ", "ШИ");

        System.out.println(sentence);
    }
}
