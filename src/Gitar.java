public class Gitar extends item implements alatMusik{

    public Gitar(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public boolean isOnSale() {
        if(getBrand().equalsIgnoreCase("Chord")) {
            return onSale = true;
        }else if(getBrand().equalsIgnoreCase("Pdip")) {
            return onSale = true;
        }else{
            return onSale = false;
        }
    }

    @Override
    public double getDiscountedPrice(){
        double value = 0;

        if(onSale){
            value = getPrice() - (getPrice() * alatMusik.max_discount);
        }
        return value;
    }

    @Override
    public int getPrice(){
        return price;
    }
}
