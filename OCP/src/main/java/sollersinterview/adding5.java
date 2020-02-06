package sollersinterview;


public class adding5 {
     int solution(int N){
        int length=calculateLength(N);
        int [] array= convertArray(N,length);
        boolean flag=true;
        int result=0;
        StringBuilder builder= new StringBuilder();
        if(N>0){

            for(int i=length-1; i>=0; i--){
                if(array[length-i-1]<=5 && flag){
                    builder.append(5);
                    flag=false;
                }
                builder.append(array[length-i-1]);
            }
            result= getResult(builder);
        }
        else if(N<0){
            builder.append('-');
            for(int i=length-1; i>0; i--){
                if(array[length-i-1]>=5 && flag){
                    builder.append(5);
                    flag=false;
                }
                builder.append(array[length-i-1]);
                if(flag && i-1==0){
                    builder.append(5);
                }
            }
            result= getResult(builder);
        }
        else
            result=50;
        return result;
    }
     int calculateLength(int N){
        String value= String.valueOf(N);
        return value.length();
    }
     int[] convertArray(int N, int length){
        String value= String.valueOf(N);
        int[] array;
        if(N>0){
            array= new int[length];
            for(int i=0; i<length; i++){
            array[i]=Integer.parseInt(String.valueOf(value.charAt(i)));
            }
        }
        else{
            array= new int[length-1];
            for(int i=0; i<length-1; i++){
                array[i]=Integer.parseInt(String.valueOf(value.charAt(i+1)));
            }
        }

        return array;
    }
     int getResult(StringBuilder builder){
        String value= builder.toString();
        int N= Integer.parseInt(value);
        return N;
    }

    public static void main(String[] args) {

        adding5 adding5 = new adding5();
        System.out.println(adding5.solution(-1032));
        System.out.println(adding5.solution(9324));
        System.out.println(adding5.solution(-91032));
        System.out.println(adding5.solution(5324));
        System.out.println(adding5.solution(3324));
        System.out.println(adding5.solution(-1832));
        System.out.println(adding5.solution(0));

        System.out.println(adding5.solution(9624));


    }
}
