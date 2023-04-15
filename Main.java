package arrayList3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemType> list = new ArrayList<>();
        char ch = 'y';
        int itemNum = 0;

        while(ch=='y'){
            itemNum++;
            System.out.println("Enter the details of Item Type " + itemNum);
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Deposit:");
            Double deposit = Double.parseDouble(sc.nextLine());
            System.out.println("Cost per Day:");
            Double costPerDay = Double.parseDouble(sc.nextLine());
            ItemType it = new ItemType(name, deposit, costPerDay);
            list.add(it);
            System.out.println("Do you want to continue?(y/n)");
            ch = sc.nextLine().charAt(0);
        }
        System.out.format("%-20s%-20s%-20s\n","Name", "Deposit", "CostPerDay");
        for(ItemType it : list){
            System.out.println(it.toString());
        }
    }
}
