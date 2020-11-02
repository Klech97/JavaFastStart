package LessonMain;

public class FiveL {
    public static void main(String[] args) {
        Worker worker = new Worker("Ivanov Ivan Ivanovich", "teacher", "dfsadsf@mail.ru","9-19-28", 23, 13500);
        worker.infoWorker();
        System.out.println();
        System.out.println("Задание 5:");
        EcampleFive();
    }

    public static void EcampleFive() {
        Worker[] workArray = new Worker[5];

        workArray[0] = new Worker("Ivanov Ivan Ivanovich", "teacher", "dfsadsf@mail.ru","9-19-28", 23, 13500);
        workArray[1] = new Worker("Smirnov Ivan Ivanovich", "teacher", "dfsadsf@mail.ru","9-19-28", 45, 13500);
        workArray[2] = new Worker("Petrov Ivan Ivanovich", "teacher", "dfsadsf@mail.ru","9-19-28", 53, 13500);
        workArray[3] = new Worker("Romanov Ivan Ivanovich", "teacher", "dfsadsf@mail.ru","9-19-28", 33, 13500);
        workArray[4] = new Worker("Soloviev Ivan Ivanovich", "teacher", "dfsadsf@mail.ru","9-19-28", 23, 13500);

        for (int i=0;i< workArray.length; i++){
            if (workArray[i].age>40){
                workArray[i].infoWorker();
            }

        }
    }
}
