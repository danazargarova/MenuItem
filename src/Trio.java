public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    @Override
    public String getName() {
        return sandwich.getName() + "/"+  salad.getName() + "/"+ drink.getName() + " Trio";
    }

    @Override
    public double getPrice() {
        if (drink.getPrice() <= sandwich.getPrice() && drink.getPrice()<= salad.getPrice() ){
            return sandwich.getPrice()+salad.getPrice();
        }

        if (sandwich.getPrice()<= salad.getPrice() && sandwich.getPrice()<=drink.getPrice()){
            return salad.getPrice()+drink.getPrice();
        }
        else{
            return salad.getPrice()+drink.getPrice();
        }
    }
}
