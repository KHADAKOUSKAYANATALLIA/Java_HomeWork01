package HomeWork05;
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной структуре будут повторяющиеся
//        имена с разными телефонами, их необходимо считать, как одного человека с разными
//        телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void addRecord(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<String>());
        phoneBook.get(name).add(phoneNumber);
    }

    public static ArrayList<String> findRecord(String name) {
        return phoneBook.get(name);
    }

    public static void main(String[] args) {
        addRecord("Собчак Ксения", "+375-29-615-18-99");
        addRecord("Бузова Ольга", "+375-29-877-57-35");
        addRecord("Бородина Ксения", "+375-29-877-57-31");
        addRecord("Собчак Ксения", "+375-44-583-94-66");
        addRecord("Бузова Ольга", "+375-33-603-58-04");
        addRecord("Бузова Ольга", "+375-29-703-34-46");
        addRecord("Бородина Ксения", "+375-29-683-60-60");
        addRecord("Бородина Ксения", "+375-33-683-60-60");
        addRecord("Бородина Ксения", "+375-29-654-19-91");

        ArrayList<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort(new Comparator<Map.Entry<String, ArrayList<String>>>() {

            public int compare(Map.Entry<String, ArrayList<String>> e1, Map.Entry<String, ArrayList<String>> e2) {
                if (e1.getValue().size() < e2.getValue().size()) {
                    return 1;
                } else if (e1.getValue().size() == e2.getValue().size()) {
                    return 0;
                }
                return -1;
            }
        });

        for (var entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " номер(а)");
        }

    }

}