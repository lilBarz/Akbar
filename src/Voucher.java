import java.time.LocalDate;

public class Voucher {
    public String code;
    public LocalDate validUntil;
    public double discount;

    Voucher(int year, int month, int day, String code){
        this.validUntil = LocalDate.of(year,month,day);
        this.code = code;
    }

    public boolean isValid(){

        if(LocalDate.now().isBefore(validUntil)){
            return true;
        } else if(LocalDate.now().equals(validUntil)){
            return true;
        } else{
            return false;
        }

    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
