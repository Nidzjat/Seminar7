package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 150000,"Senior");
        Company yandex = new Company("Yandex", publisher, 60000,"Junior");
        Company geekBrains = new Company("GeekBrains", publisher, 100000,"Middle");

        Student student = new Student(" ");
        Master master = new Master("");
        Analyst analyst = new Analyst("");

        publisher.registerObserver(student);
        publisher.registerObserver(master);
        publisher.registerObserver(analyst);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }

}
