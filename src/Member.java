public class Member {
    protected String name;
    protected OverdueFee overdueFee;
    public double getAmountOverdue(){
            return overdueFee.amount - (overdueFee.discount/100 * overdueFee.amount);
    }
    public void setAmountOverDue(double amount,double discount){
        overdueFee = new OverdueFee();
        overdueFee.amount = amount;
        overdueFee.discount = discount;
    }
    public static void main(String args[]){
        Member member = new Member();
        member.setAmountOverDue(125,25);
        System.out.println(member.getAmountOverdue());
    }
}
class OverdueFee{
    protected double discount;
    protected double amount;
}
