package HomeWork06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        ArrayList<Notebook> listObject = new ArrayList<>();
        listObject.add(new Notebook("серый", "Lenovo"));
        listObject.add(new Notebook("белый", "Hp"));
        listObject.add(new Notebook("черный", "Mac"));
        listObject.add(new Notebook("черный", "Hp"));
        listObject.add(new Notebook("белый", "Lenovo"));
        listObject.add(new Notebook("серый", "Mac"));

        seachVar(listObject, choseParametrs());
    }

    public static void seachVar(ArrayList<Notebook> listObj, Map<String, String> parametrsForSeach) {
        ArrayList<Notebook> result = new ArrayList<>();
        if (parametrsForSeach.isEmpty()) {
            System.out.println("Введите хотя бы один параметр поиска!\n");
            seachVar(listObj,
                    choseParametrs());
        } else {
            var fields = parametrsForSeach.keySet();
            for (Object field : fields) {
                for (Notebook obj : listObj) {
                    if (obj.parametrsMap().get(field.toString()).toString()
                            .equals(parametrsForSeach.get(field.toString()))) {
                        if (!result.contains(obj)) {
                            result.add(obj);
                        }
                    }
                }
            }
            for (Object field : fields) {
                ArrayList<Notebook> temp = new ArrayList<>(result);
                for (Notebook obj : temp) {
                    if (!obj.parametrsMap().get(field.toString()).toString()
                            .equals(parametrsForSeach.get(field.toString()))) {
                        result.remove(obj);
                    }
                }
            }
            if (result.isEmpty()) {
                System.out.println("По вашему запросу ничего не найдено =(");
            } else {
                for (Notebook obj : result) {
                    System.out.println(obj);
                }
            }
        }
    }

    public static Map<String, String> choseParametrs() {
        Map<String, String> parametrs = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите color или оставьте поле пустым:");
        String temp = scan.nextLine();
        if (!temp.equals(""))
            parametrs.put("color", temp.toLowerCase());

        System.out.println("Введите model или оставьте поле пустым:");
        temp = scan.nextLine();
        if (!temp.equals(""))
            parametrs.put("model", temp.toLowerCase());
        scan.close();
        return parametrs;
    }
}