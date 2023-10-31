import java.util.ArrayList;

public class Cashier {
    public double currentPrice;
    public double[] currentDiscounts = new double[3];
    public double total;
    public Voucher[] vouchers = new Voucher[5];

    public void addPrice(double price){
        this.currentPrice = this.currentPrice + price;
    }

    public void addDisc(double disc){
        this.currentDiscounts[0] = disc;
    }




    public void addVoucher(String code){
        vouchers[0] = new Voucher(2023,5,9,"AEZAKMI");
        vouchers[1] = new Voucher(2023,5,8,"WALLHACK");
        vouchers[2] = new Voucher(2023,5,3,"AIMBOT");


        if(code.equalsIgnoreCase(vouchers[0].getCode()) && vouchers[0].isValid()){
            if(vouchers[0].isValid()) {
                vouchers[0].setDiscount(0.05);
                this.currentDiscounts[1] = vouchers[0].getDiscount();
            }else{
                vouchers[0].setDiscount(0);
                this.currentDiscounts[1] = vouchers[0].getDiscount();
                System.out.println("Maaf voucher anda mungkin tidak ditemukan dan sudah expired");
            }
        } else if(code.equalsIgnoreCase(vouchers[1].getCode()) && vouchers[1].isValid()){
            if(vouchers[1].isValid()) {
                vouchers[1].setDiscount(0.01);
                this.currentDiscounts[1] = vouchers[1].getDiscount();
            } else {
                vouchers[1].setDiscount(0);
                this.currentDiscounts[1] = vouchers[1].getDiscount();
                System.out.println("Maaf voucher anda mungkin tidak ditemukan dan sudah expired");
            }
        } else if(code.equalsIgnoreCase(vouchers[2].getCode())){
            if(vouchers[2].isValid()) {
                vouchers[2].setDiscount(0.02);
                this.currentDiscounts[1] = vouchers[2].getDiscount();
            }else{
                vouchers[1].setDiscount(0);
                this.currentDiscounts[1] = vouchers[2].getDiscount();
                System.out.println("Maaf voucher anda mungkin tidak ditemukan dan sudah expired");
            }
        } else {
            System.out.println("Maaf voucher anda mungkin tidak ditemukan dan sudah expired");
        }

    }



    public double getTotal(){
        return total;
    }

    public void setTotal(){
        this.total = this.currentPrice - (this.currentPrice * (this.currentDiscounts[0] + this.currentDiscounts[1]));
    }
}
