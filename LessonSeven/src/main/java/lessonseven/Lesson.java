package lessonseven;
import java.util.Scanner;
public class Lesson {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, false);
        Plate plate = new Plate(50);
        /*plate.info();
        cat.eat(plate);
        plate.info();*/

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Boris", 30, false);
        cats[1] = new Cat("Vitya", 20, false);
        cats[2] = new Cat("Fobos", 10, false);

        for(int i=0; i<3; i++){
            cats[i].eat(plate);
            if(!cats[i].infoSatiety()){
                statusSatiety(cats[i], plate);
            }
            cats[i].info();
        }
    }

    public static void statusSatiety(Cat cat, Plate plate){
        Scanner sc = new Scanner(System.in);
        boolean satietyCat = cat.infoSatiety();
        while (satietyCat==false){
            System.out.println("Покормить кота? 1-Да 2-Нет");
            if(sc.nextInt()==1){
                System.out.println("Сколько положить?");
                plate.increaseFood(sc.nextInt());
            }
            cat.eat(plate);
            satietyCat = cat.infoSatiety();
        }
    }

}
