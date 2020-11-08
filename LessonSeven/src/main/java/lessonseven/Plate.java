package lessonseven;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food-n<0){
            System.out.println("Положи коту еды на "+(-1*(food-n))+" ед.");
        } else {
            food -=n;
        }
    }

    public boolean statusFood(int n){
       if(food-n>=0){
           return true;
       } else {
           return false;
       }
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
