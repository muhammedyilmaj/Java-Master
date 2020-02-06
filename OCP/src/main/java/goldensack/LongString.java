package goldensack;

public class LongString {


    static int[] finfOut(String s){
        int length=s.length();
        int longestNumber=0;
        int shortestNumber=0;
        int currentNumber=0;
        int startNumber=-1;
        int finishNumber=0;
        int [] result= new int[2];
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                if(startNumber==-1){
                    startNumber=i;
                }
                currentNumber++;
            }
            else{
                if(longestNumber<=currentNumber){
                    longestNumber=currentNumber;
                    shortestNumber=startNumber;
                    finishNumber=i;
                    currentNumber=0;
                    startNumber=-1;
                }
                else{
                    startNumber=-1;
                    currentNumber=0;
                }
            }
        }
        if(longestNumber<=currentNumber){
            shortestNumber=startNumber;
            finishNumber=length-1;
        }
        result[0]= shortestNumber;
        result[1]= finishNumber;

        return result;

    }
    public static void main(String[] args) {
        String a="aaaaaaaaaabbbbbbccccccddddd";
        int [] result=finfOut(a);
        for (int i:result) {
            System.out.println(i);

        }
    }
}
