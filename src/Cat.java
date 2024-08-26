public class Cat extends Animal {
    String name;
    int appetite;
    boolean fullness;
    static int countCat = 0;

    Cat (String name , int appetite, boolean fullness){
        super();
        countCat++;
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    @Override
    public  void run(int range) {
        if (range > 200) {
            System.out.println(name+ " Не может бежать больше 200 м");
        } else {
            System.out.println(name + " Пробежал " + range + " м");
        }
    }

    @Override
    public void swim(int range) {
        System.out.println("Не умеет плавать");
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    static int getCountCat(){
        return countCat;
    }

}
