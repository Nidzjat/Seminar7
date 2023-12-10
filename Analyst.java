package ru.geekbrains.lesson7.observer;

public class Analyst implements Observer {
    private String name;

    public Analyst(String name) {
        this.name = name;
    }

    private int salary = 80000;

    private String vacancy = "Middle";

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Аналитик %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; Вакансия : %s)\n",
                    name, nameCompany, salary,vacancy);
            this.salary = salary;
            this.vacancy = vacancy;
        }
        else {
            System.out.printf("Аналитик %s: Я найду работу получше! (компания: %s; заработная плата: %d; Вакансия : %s)\n",
                    name, nameCompany, salary,vacancy);
        }
    }
}
