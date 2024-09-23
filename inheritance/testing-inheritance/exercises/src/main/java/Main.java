public class Main {
    public static void main(String[] args) {
        HouseCat tommy = new HouseCat("Tommy", 35);

        tommy.sleep();
        System.out.println("After sleeping Tommy is " + (tommy.isHungry()? "hungry" : "full") + " and " + (tommy.isTired()? "tired" : "wide awake"));
        tommy.eat();
        System.out.println("After eating Tommy is " + (tommy.isHungry()? "hungry" : "full") + " and " + (tommy.isTired()? "tired" : "wide awake") + " and " + (tommy.isSatisfied()? "satisfied" : "unsatisfied"));

        HouseCat spike = new HouseCat("Spike");
        System.out.println("\nLatest house cat: " + spike.getName());
    }
}
