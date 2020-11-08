package lessonseven;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        if (p.statusFood(appetite)){
            p.decreaseFood(appetite);
            this.satiety = true;
        } else {
            System.out.println(this.name + " не хватило еды");
            p.decreaseFood(appetite);
        }

    }

    public void info() {
        System.out.println("Имя: "+this.name+" сытость: "+this.satiety);
    }

    public boolean infoSatiety() {
        if (this.satiety){
            return true;
        } else {
            return false;
        }
    }
}
