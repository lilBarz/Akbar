interface Membership{
    public double premium_Disc = 0.1;
    public double gold_Disc = 0.075;
    public double silver_Disc = 0.05;

    public double getMemberDiscount();
}

public abstract class Person {
    public String name;

    public abstract void setName(String name);
    public abstract String getName();

}
