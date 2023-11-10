public class Discoounts {
    public double CheckDiscount(boolean withing10Days, boolean isSpecial, boolean web ,int amount){
        double discount = 0;
        if(!withing10Days)
            discount =0;
        else if(isSpecial)
            discount =0;
        else{
            if(amount>1000 && !web){
                discount = 0.04;
            } else if(amount>1000){
                discount = 0.09;
            }
            if(amount >500 && amount < 1000 && !web){
                discount = 0.02;
            } else if(amount >500 && amount < 1000){
                discount = 0.07;
            }
        }
        return discount;
    }
}
