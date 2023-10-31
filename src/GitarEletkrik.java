public class GitarEletkrik extends item implements alatElektronik,alatMusik{

    public GitarEletkrik(String brand,String model,int price){
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
        if(getBrand().equalsIgnoreCase("Spanyol")) {
            System.out.println("Selamat gitar ini mendapatkan diskon!!!");
            return onSale = true;
        }else if(getBrand().equalsIgnoreCase("Yamaha")) {
            System.out.println("Selamat gitar ini mendapatkan diskon!!!");
            return onSale = true;
        }else if(getBrand().equalsIgnoreCase("PSG")){
            System.out.println("Selamat gitar ini mendapatkan diskon!!!");
            return onSale = true;
        } else{
            return onSale = false;
        }
    }

    @Override
    public double getDiscountedPrice() {
        double value = 0;

        if(onSale){
                value = getPrice() - (getPrice() * (alatMusik.max_discount + alatElektronik.max_discount));
    } else{
            value = getPrice();
        }
        return value;
    }

    @Override
    public int getPrice(){
        return price;
    }
}
