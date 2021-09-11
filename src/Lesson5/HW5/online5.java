package Lesson5.HW5;

import java.util.Arrays;

public class online5 {
    public static void main(String[] args) {

        //Создать массив из 5 сотрудников.
        Employee[] sotrudnik = new Employee[5];
        sotrudnik[0] = new Employee("Olga", "manager", "manager@mail.ru", 8910, 50000, 25);
        sotrudnik[1] = new Employee("Masha", "designer", "designer@mail.ru", 8911, 50000, 35);
        sotrudnik[2] = new Employee("Dasha", "QA", "QA@mail.ru", 8912, 50000, 45);
        sotrudnik[3] = new Employee("Natasha", "architect", "architect@mail.ru", 8913, 50000, 55);
        sotrudnik[4] = new Employee("Katerina", "director", "director@mail.ru", 8914, 50000, 65);

        System.out.println(sotrudnik[0].getAge());


       for (int i = 0; i < sotrudnik.length; i++) {
            if (sotrudnik[i].old > 40) {
               System.out.println(sotrudnik[i].getAge());
           }
       }
    }
}
//С помощью цикла вывести информацию только
// о сотрудниках старше 40 лет.