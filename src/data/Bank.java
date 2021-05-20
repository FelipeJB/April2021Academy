package data;

public class Bank {
    public Account account1;
    public float money;

    public float getAdd(float amount){
        money = money + amount;
        return money;
    }
    public float getSub(float amount){
        money = money - amount;
        return money;
    }
    public float getMoney(){
        return money;
    }




}
