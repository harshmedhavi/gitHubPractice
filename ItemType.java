package arrayList3;

public class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;
    public ItemType(){};
    public ItemType(String name, double deposit,
                    double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    };

    public String getName(){
        return name;
    }
    public Double getDeposit(){
        return deposit;
    }
    public Double getCostPerDay(){
        return costPerDay;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s",name,deposit,costPerDay);
    }
}
