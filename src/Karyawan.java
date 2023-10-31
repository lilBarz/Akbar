public class Karyawan extends Person {
    public double discount = 0.125;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }


}
