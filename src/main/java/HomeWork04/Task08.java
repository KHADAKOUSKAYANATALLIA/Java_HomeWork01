package HomeWork04;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает
//первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
//Формат сдачи: ссылка на гит


import java.util.LinkedList;
import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
        LinkedList<Integer> my_List = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            my_List.add(i, rand.nextInt(100));
        }
        System.out.printf("Начальный список: %s \n", my_List);
        System.out.printf("Список с добавлением элемента в конец %s \n", enqueue(my_List, 10));

        System.out.printf("Первый элемент списка %s \n", dequeue(my_List));
        System.out.printf("Начальный список после удаления первого элемента : %s \n", my_List);

        System.out.printf("Первый элемент списка %s \n", first(my_List));
        System.out.printf("Начальный список без удаления первого элемента: %s \n", my_List);
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.getFirst();
        list.removeFirst();
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }

}