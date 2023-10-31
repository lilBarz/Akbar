interface alatMusik{
    public double max_discount = 0.15;
}

interface alatElektronik{
    public double max_discount = 0.2;
}

public abstract class item {
    public String brand;
    public String model;
    public int price;
    public boolean onSale;
    public double discount;


    public abstract String getBrand();
    public abstract String getModel();
    public abstract boolean isOnSale();
    public abstract double getDiscountedPrice();
    public abstract int getPrice();


}
