
public class Pelanggan extends Person implements Membership {
    public String memberType;
    boolean isMember;

    public Pelanggan(String member){
        this.memberType = member;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }


    public String getMemberType(){
        return memberType;
    }

    @Override
    public double getMemberDiscount() {
        double value = 0;

        if (getMemberType().equalsIgnoreCase("silver")) {
            value = Membership.silver_Disc;
        } else if (getMemberType().equalsIgnoreCase("gold")) {
            value = Membership.gold_Disc;
        } else if (getMemberType().equalsIgnoreCase("premium")) {
            value = Membership.premium_Disc;
        } else {
            value = 0;
        }
    return value;
    }

    public boolean isMember(String member){
        if(member.equalsIgnoreCase(getMemberType())){
            return isMember = true;
        } else {
            return isMember = false;
        }
    }


}
