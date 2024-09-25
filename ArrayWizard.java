import java.util.ArrayList;

/**
 * ArrayWizard
 */
public class ArrayWizard {

    public static void main(String[] args) {
        ArrayList<Integer> randomIntegers = new ArrayList<Integer>();

        randomIntegers.add(2);
        randomIntegers.add(1);
        randomIntegers.add(3);
        randomIntegers.add(31);

        System.out.println(printSum(randomIntegers));

        System.out.println("max : " + findMax(randomIntegers));
        System.out.println("min : " + findMin(randomIntegers));


    }

    public static ArrayList<Integer> printSum(ArrayList<Integer> randomInput){

        int even = 0;
        int odd = 0;

        ArrayList<Integer> randomIntegers2 = new ArrayList<Integer>();

        for(int i = 0; i < randomInput.size(); i++){
            if(i % 2 == 0){
                even += randomInput.get(i);
            }else{
                odd += randomInput.get(i);
            }
        }

        randomIntegers2.add(odd);
        randomIntegers2.add(even);

        return randomIntegers2;
    }


    public static int findMax (ArrayList <Integer> givenList){
        
        //defining temporary max value 
        int max = givenList.get(0);

        for(int m = 0 ; m < givenList.size() ; m++ ){

            if(givenList.get(m) > max){
                max = givenList.get(m);
            }
        }
        
        return max;

    }
    
    public static int findMin (ArrayList <Integer> givenList){

        int min = givenList.get(0);

        for (int i = 0 ; i < givenList.size() ; i++){

            if(givenList.get(i) < min){
                
                min = givenList.get(i); 
            }

        }
        return min;

    }

    
}