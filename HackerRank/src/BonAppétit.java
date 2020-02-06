import java.util.ArrayList;
import java.util.List;

public class BonAppétit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalamount=0;
        int totalamountwithoutanna=0;
        for(int i=0;i<bill.size();i++){
            totalamount+=bill.get(i);
            if(i!=k){
                totalamountwithoutanna+=bill.get(i);
            }
        }
        if(totalamountwithoutanna/2==b){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(totalamount/2-totalamountwithoutanna/2);
        }


    }

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3 );
        list.add(10);
        list.add(2);
        list.add(9);
        bonAppetit(list,1,7);

    }
}
