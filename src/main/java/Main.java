import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        SomeFunctions functions = new SomeFunctions();
//        String text = functions.getWelcomeText("Valera");
//        System.out.println(text);
        String text = "Как сообщалось, сегодня во многих местах Латвии будет временно идти дождь, но жара все еще сохранится. Из-за продолжительной жары в столице было вынесено оранжевое предупреждение. Это означает, что жара подвергает жителей повышенному риску возникновения проблем со здоровьем, особенно у пожилых людей и младенцев.";
        String[] words = text.split(" ");
        System.out.println("Количество слов: " + words.length);
        for (int i = 0; i < words.length; i = i + 2) {
            System.out.println("The word with index " + i +" is: " + words[i]);
        }
        for (String word : words) {
            System.out.println(word);
        }

        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Viola");
        names.add("Lena");
        names.add("Katy");

        System.out.println(names.get(1));

        for (String name: names) {
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 1);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
