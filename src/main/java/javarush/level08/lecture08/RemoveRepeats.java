package javarush.level08.lecture08;

import java.util.HashMap;
import java.util.Map;

public class RemoveRepeats {

//    Нам повторы не нужны
//Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
//Удалить людей, имеющих одинаковые имена.
//
//
//Requirements:
//1. Программа не должна выводить текст на экран.
//2. Программа не должна считывать значения с клавиатуры.
//3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
//4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
//5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map); //создается копия мапы, вероятно чтобы избежать эксепшена

        for (String name : copy.values()) {            //цикл по значениям в копии мапы
            int count = 0;                             //переменная счетчик
            for (String nameTmp : map.values()) {      //цикл по значениям оригинальной мапы
                if (nameTmp.equals(name)) {            //если значение оригинальной мапы совпадает со значением копии
                    count++;                           //увеличить переменную на 1
                }
            }
            if (count > 1) {                           //если счетчик больше 1-го
                removeItemFromMapByValue(map, name);   //в метод удаления передается имя из копии мапы
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + " - " + value);
        }
    }
}
