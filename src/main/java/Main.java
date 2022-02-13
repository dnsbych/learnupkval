import java.util.Arrays;

/*
Создайте класс `IndexStorage` с тремя методами - `size()`, `get(int index)` и `reverse`.
Пусть размер заполняется конструктором, а `get` возвращает то же,
что и в прошлом задании (т.е. индекс или -индекс в зависимости от чётности).
Напишите метод `reverse()`, который возвращает массив, заполненный элементами в обратном порядке.
Сделайте этот класс без хранения массивов в полях.

Создайте ему наследника `ArrayIndexStorage`, который бы принимал в конструкторе один параметр - массив интов,
в котором хранил бы все данные. `get(int index)` должен возвращать значение ячейки массива под номером этого индекса.
Обеспечьте корректную работоспособность всех методов, причём сделайте оба класса так,
чтобы для этого не пришлось переопределять `reverse` в `ArrayIndexStorage`
*/

public class Main {

    public static void main(String[] args) {
        IndexStorage isdata = new IndexStorage(10);
        System.out.println(isdata.size());
        System.out.println(isdata.get(5));
        System.out.println(Arrays.toString(isdata.reverse()));

        ArrayIndexStorage dataArr = new ArrayIndexStorage(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(dataArr.size());
        System.out.println(dataArr.get(5));
        System.out.println(Arrays.toString(dataArr.reverse()));

    }
}
