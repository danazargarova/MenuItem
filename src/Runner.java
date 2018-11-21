public class Runner {

    public static void main(String[] args)
    {
        Sandwich reuben = new Sandwich("Reuben", 5.75);
        Sandwich bec = new Sandwich("BEC", 2.00);
        Salad waldorf = new Salad("Waldorf", 7.25);
        Salad caesar = new Salad("Caesar", 4.50);
        Drink icedTea = new Drink("Iced Tea",1.50);
        Drink smoothie = new Drink("Smoothie", 5.50);

        Trio trio1 = new Trio(reuben, waldorf,icedTea);
        Trio trio2 = new Trio(bec,caesar,smoothie);
        Trio trio3 = new Trio(bec,caesar,icedTea);

        System.out.println(trio1.getName() + " Price: "+trio1.getPrice());
        System.out.println(trio2.getName() + " Price: "+trio2.getPrice());
        System.out.println(trio3.getName() + " Price: "+trio3.getPrice());


    }
}
