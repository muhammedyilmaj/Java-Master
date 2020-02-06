import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int result=0;
        int value=0;
        if(m==1){
            if(s.get(0)==d){
                result= 1;
            }
        }
        else{
            for(int i=0;i<s.size()-m+1;i++){
                int control=i;
                for(int j=0; j<m; j++){
                    value+=s.get(i);
                    i++;
                }
                if(value==d){
                    result++;
                    i=control;
                    value=0;
                }
                else{
                    i=control;
                    value=0;}

            }
        }


        return result;
    }
        public static void main (String[]args){
            List<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(5);
            list.add(1);
            list.add(3);
            list.add(4);
            list.add(4);
            list.add(3);
            list.add(5);
            list.add(1);
            list.add(1);
            list.add(2);
            list.add(1);
            list.add(4);
            list.add(1);
            list.add(3);
            list.add(3);
            list.add(4);
            list.add(2);
            list.add(1);
            System.out.println(birthday(list, 18, 7));
        }
    }

