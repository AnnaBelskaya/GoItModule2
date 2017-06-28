package goit.education.module2;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Введите имя: ");
        String name = s.nextLine();
        System.out.print("Введите название города: ");
        String city = s.nextLine();
        System.out.print("Введите возраст: ");
        int age = s.nextInt();
        System.out.print("Введите хобби: ");
        String hobby = s.next();
        System.out.println("----------------------");

        //Вариант 1 (табличный):
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);
        System.out.println("----------------------");

        //Вариант 2 (текстовый):
        System.out.printf("Человек по имени %s живет в городе %s.\n", name,city);
        if (age%10 == 1){
            System.out.printf("Этому человеку %d год и любит он заниматься %sм.\n",age,hobby);
        } else {
            if (age%10 == 2 || age%10 == 3 || age%10 == 4){
                System.out.printf("Этому человеку %d года и любит он заниматься %sм.\n",age,hobby);
            } else {
                System.out.printf("Этому человеку %d лет и любит он заниматься %sм.\n",age,hobby);
            }
        }
        System.out.println("----------------------");

        //Вариант 3 (иной):
        System.out.println(name + " - имя");
        System.out.println(city + " - город");
        System.out.println(age + " - возраст");
        System.out.println(hobby + " - хобби");
    }
}