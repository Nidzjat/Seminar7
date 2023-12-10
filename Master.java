package ru.geekbrains.lesson7.observer;

import java.util.Objects;

public class Master implements Observer{

    private String name;

    public Master(String name) {
        this.name = name;
    }

    private int salary = 100000;

    private String vacancy = "Senior";

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; Вакансия : %s)\n",
                    name, nameCompany, salary,vacancy);
            this.salary = salary;
            this.vacancy = vacancy;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d; Вакансия : %s)\n",
                    name, nameCompany, salary,vacancy);
        }
    }

}
