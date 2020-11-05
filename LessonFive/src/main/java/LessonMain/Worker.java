package LessonMain;

public class Worker {
    public String FIO;
    public String position;
    public String email;
    public String number;
    public int salary;
    public int age;

    public void infoWorker() {
        System.out.println("FIO: " + FIO + "; Должность: " + position + "; Возраст: " + age
                + "; email: " + email + "; номер телефона: " + number + "; зарплата: " + salary);
    }

    public Worker(String FIO, String position,
                  String email, String number,
                  int age, int salary) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.number = number;
        this.age = age;
        this.salary = salary;
    }

}
