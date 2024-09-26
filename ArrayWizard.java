import java.util.ArrayList;
import java.util.Random;

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
    public static ArrayList<Integer> createList(int size){;

        ArrayList<Integer> list = new ArrayList<>();

        Random randomize = new Random();

        for(int i = 0; i< size; i++){

        int number = randomize.nextInt(101);

        list.add(number);
        }
        return list;
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
     
    
    public static ArrayList<Double> averageDifference (ArrayList<Integer> arr1){
        double average;
        double sum = 0;
        ArrayList<Double> arr2 = new ArrayList<Double>();

        for(int i = 0; i < arr1.size(); i++){
            sum += arr1.get(i);
        }

        average = sum / arr1.size();

        for(int j = 0; j < arr1.size(); j++){
            double difference = arr1.get(j) - average;
            arr2.add(difference);
        }

        return arr2;
    
    }

    
}