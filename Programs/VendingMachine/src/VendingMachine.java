public class VendingMachine {
    private Item snack;
    private Item drink;

    public VendingMachine() {
        snack = new Item();
        drink = new Item();
    }

    public VendingMachine(String snackName, String drinkName) {
        snack = new Item(snackName);
        drink = new Item(drinkName);
    }






}
