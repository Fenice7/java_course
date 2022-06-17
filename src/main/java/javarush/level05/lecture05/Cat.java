package javarush.level05.lecture05;

// Сравнение объектов по параметрам

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    // метод compare
    // Comparator возвращает int по следующей схеме:
    // - отрицательный int (первый объект отрицательный, то есть меньше)
    // - положительный int (первый объект положительный, хороший, то есть больший)
    // - ноль = объекты равны

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        // поочереди сравниваются параметры объектов, результат записывается в переменную
        int comAge = Integer.compare(this.age, anotherCat.age);
        System.out.println(comAge);
        int comWeight = Integer.compare(this.weight, anotherCat.weight);
        System.out.println(comWeight);
        int comStrength = Integer.compare(this.strength, anotherCat.strength);
        System.out.println(comStrength);

        // результаты сравнения складываются и результат присваивается переменной
        int scope = comAge + comWeight + comStrength;

        // если при сложении получилось число больше нуля, возвращается true, значит этот объект больше
        // если получилось число меньше нуля или ноль, возвращается false, значит этот объект меньше, больше тот который передаем в метод
        return scope > 0;

    }


}