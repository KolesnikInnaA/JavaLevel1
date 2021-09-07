package Lesson3.online;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        // String userName = getInputUserName("Введите Ваше имя");
        // System.out.println("Hello " + userName);
        // System.out.println("Result = " + (getInputUserValue("Enter your number") * 2));
        System.out.println(random1(-40, 20) + "");
        for (int i = 0; i < 5; i++) ;
        // System.out.println("Привет " + windowUserName( "Как Вас зовут"));
        System.out.println(random.nextInt());
        for (int i = 0; i < 5; i++) ;
        System.out.println(randomizer(10));


        //сканер считываетчто-то медодом next. String-мы считываем и выводим строку.
    }

    public static String getInputUserName(String message) {
        System.out.print(message + " > ");
        return scanner.next();
    }

    public static int random1(int min, int max) {
        int tmp = max - min;
        int value = random.nextInt(tmp + 1);
        return min + value;
    }

    // public static int getInputUserValue(String message) {
    //  System.out.print(message + " > ");
    //// return scanner.nextInt();
    // }
    public static String randomizer(int valueChars) {
        String tmp = "";
        for (int i = 0; i < valueChars; i++); {
            int valueAscii = random1(80, 130);
            char tmpChar = (char) valueAscii;
            tmp += tmpChar;
        }
        return tmp;
    }

// микросервис логина. мы не знаем заране что придет, пишем программу, работающую на вход.
//пишем меню, которое будет выдавать пользователю информацию в окне ввода.
    //public static String windowUserName (String msg) {
        //System.out.println(msg + ">");
        //выше - система печатает сообщение( месседж) + >, ниже - возвращаем то, что введет пользователь
       //// return task3.next();
    //}
}
