public class Dog extends Animal{
    String name;
    static int countDod = 0;

    Dog(String name){
        super();
        countDod++;
        this.name = name;
    }
    @Override
    public void run(int range) {
        if (range > 500) {
            System.out.println(name+ " Не может бежать больше 500 м");
        } else {
            System.out.println(name+ " Пробежал " + range + " м");
        }
    }
    @Override
    public void swim(int range) {
        if (range > 10) {
            System.out.println("не может плыть больше " +range+ " м");
        } else {
            System.out.println(name + " Проплыл " + range + " м");
        }
    }
    static int getCountDod (){
        return countDod;
    }
}
