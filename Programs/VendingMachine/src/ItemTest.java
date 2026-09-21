public class ItemTest {

    public static boolean testConstructors() {
        String snackName = "Snack";
        String drinkName = "Drink";
        int quantity = 5;
        Item s = new Item();
        Item d = new Item();
        Item snack = new Item(snackName);
        Item drink = new Item(drinkName);
        Item snackQ = new Item(snackName, quantity);
        Item drinkQ = new Item(drinkName, quantity);

        assert(s.getSnackName().equals(""));
        assert(d.getSnackName().equals(""));
        assert(snack.getSnackName().equals(snackName));
        assert(drink.getSnackName().equals(drinkName));
        assert(s.getQuantity() == 0);
        assert(d.getQuantity() == 0);
        assert(snack.getQuantity() == 0);
        assert(drink.getQuantity() == 0);
        assert(snackQ.getQuantity() == quantity);
        assert(drinkQ.getQuantity() == quantity);
        return true;
    }

    public static boolean testGettersAndSetters() {
        String snackName = "Snack";
        String drinkName = "Drink";
        int quantity = 5;
        Item s = new Item();
        Item d = new Item();
        Item snack = new Item(snackName);
        Item drink = new Item(drinkName);
        Item snackQ = new Item(snackName, quantity);
        Item drinkQ = new Item(drinkName, quantity);

        s.restock(1);
        d.restock(2);
        snack.restock(20);
        drink.restock(10);
        snackQ.purchase();
        drinkQ.purchase(3);
        assert(s.getQuantity() == 1);
        assert(d.getQuantity() == 2);
        assert(snack.getQuantity() == 20);
        assert(drink.getQuantity() == 10);
        assert(snackQ.getQuantity() == quantity-1);
        assert(drinkQ.getQuantity() == quantity-3);
        return true;
    }
}
