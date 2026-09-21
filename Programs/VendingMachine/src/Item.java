public class Item {
    private String snackName;
    private int quantity;

    public Item()
    {
        this("", 0);
    }

    public Item(String snackName) {
        this(snackName, 0);
    }

    public Item(String snackName, int quantity) {
        this.snackName = snackName;
        this.quantity = quantity;
    }

    public String getSnackName() {
        return snackName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void restock(int quantity) {
        this.quantity += quantity;
    }

    public void purchase()
    {
        this.quantity -= 1;
    }

    public void purchase(int quantity) {
        this.quantity -= quantity;
    }

    public String reportInventory()
    {
        return "Snack/Drink Name: " + this.snackName + "\nQuantity: " + this.quantity;
    }
}
