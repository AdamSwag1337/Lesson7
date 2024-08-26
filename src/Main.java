import java.util.Scanner;

public class Main {
//    Animal animal = new Animal();
//    Animal animal1 = new Animal();
//    Animal animal2 = new Animal();
//
//    Cat murzik = new Cat("Мурзик");
//    Dog barbos = new Dog("Барбос");
//    Cat murzik1 = new Cat("Мурзик");
//    Dog barbos1 = new Dog("Барбос");
//        murzik.run(150);
//        murzik.run(201);
//        murzik.swim(0);
//
//        barbos.run(500);
//        barbos.run(501);
//        barbos.swim(10);
//        barbos.swim(11);
//        System.out.println("Всего животных: " + Animal.getCountAnimal());
//        System.out.println("Всего котов: " + Cat.getCountCat());
//        System.out.println("Всего собак: " + Dog.getCountDod());
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Барсик", 5, false);
        allCats[1] = new Cat("Снежок", 30, false);
        allCats[2] = new Cat("Мурзик", 10, false);
        allCats[3] = new Cat("Челик", 45, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (!allCats[i].fullness && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
