package Lesson2.HW2;
//1. Написать метод, принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//в противном случае – false.
//2. Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//Замечание: ноль считаем положительным числом.
//3. Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//4. Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
//5.* Написать метод, который определяет, является ли год високосным,
//и возвращает boolean (високосный - true, не високосный - false).
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class HomeWork2 {
    public static void main(String[] args) {
        boolean res = task1(5, 10);
        System.out.println(res);
        task2(0);
        System.out.println(task3(4));
        task4("hello", 3);
        task4("Лето", 2 );
        System.out.println(task5(2021));
    }

    //1
    public static boolean task1(int a, int b) {
        int c = a + b;
        return 10 < c && c <= 20;
    }

    //2
    public static void task2(int d) {
        if (d >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //3
    public static boolean task3(int e) {
        return e < 0;
    }

    //4
     public static void task4(String text, int n ) {
         for (int i = 1; i<= n; i++) {
             System.out.println(text);
     }
   }

   //5
    public static boolean task5(int x) {
     return    (x % 400==0) || (x % 4==0 && x % 100!=0);
    }
}
