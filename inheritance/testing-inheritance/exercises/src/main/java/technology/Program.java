package technology;

public class Program {
    public static void main(String[] args) {
        SmartPhone dougsIphone = new SmartPhone("Doug", "Apple", "iOS", 8);
        Laptop dougsMacbookPro = new Laptop();

        System.out.println( dougsIphone.printName() + ": " + dougsIphone.printOs() + ", ID: " + dougsIphone.getId());
        System.out.println("Doug's MacbookPro ID is: " + dougsMacbookPro.getId());
    }
}
