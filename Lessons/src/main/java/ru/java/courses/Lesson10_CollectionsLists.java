package ru.java.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {

        List <String> output = new ArrayList<String>();

        Collections.sort(source);

        int previous = source.get(0);
        output.add(source.get(0).toString());

        for (int i = 0; i < source.size(); i++){
            if(source.get(i) != previous){
                output.add(source.get(i).toString());
                previous = source.get(i);
            }
        }

        return output;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        if(array.length < 3){
            return null;
        }

        List<Integer> listOfIntegers = Arrays.asList(array);
        List<Integer> listOfIntegers3to7 = new ArrayList<Integer>();

        int i = 3;
        while(i < array.length && i < 8){
            int temp = listOfIntegers.get(i);

            if(temp % 2 == 0){
                listOfIntegers3to7.add(temp + 1);
            }else{
                listOfIntegers3to7.add(temp);
            }
            i++;
        }

        return listOfIntegers3to7;
    }
}
