package Lesson5.HW5;

public class Employee {

    // Создать класс "Сотрудник" с полями: ФИО,
// должность, email, телефон, зарплата, возраст.
    String name;
    String work;
    String email;
    int phone;
    int money;
    int old;



    public Employee(String name, String work, String email, int phone, int money, int old) {

        this.name = name;
        this.work = work ;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.old = old;
    }
    //Внутри класса «Сотрудник» написать метод, который
    // возвращает информацию об объекте.

    public String getAge() {
        return ( this.name + "; " +
                this.work + "; " +
                this.email + "; " +
                this.phone + "; " +
                this.money + "; " +
                this.old+ "; ");

    }
}






