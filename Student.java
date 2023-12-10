package ru.geekbrains.lesson7.observer;

import java.util.Objects;

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    private int salary = 2000;

    private  String vacancy ="junior";

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary && Objects.equals(this.vacancy,vacancy)){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; Вакансия : %s)\n",
                    name, nameCompany, salary,vacancy);
            this.salary = salary;
            this.vacancy = vacancy;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d; Вакансия : %s)\n",
                    name, nameCompany, salary,vacancy);
        }
    }
}
