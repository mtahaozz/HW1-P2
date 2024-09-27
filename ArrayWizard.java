package HW1P2;
import java.util.ArrayList;
import java.util.Random;

/**
 * ArrayWizard
 */
public class ArrayWizard {

    public static void main(String[] args) {
        Integer[] randomIntegers = new Integer[4] ;

        randomIntegers[0] = 2;
        randomIntegers[1] = 1;
        randomIntegers[2] = 3;
        randomIntegers[3] = 31;

        //System.out.println(printSum(randomIntegers));

        System.out.println("max : " + findMax(randomIntegers));
        System.out.println("min : " + findMin(randomIntegers));


    }
    public static Integer[] createArray(int size){
            
        Integer[] list = new Integer[size];
        
        Random randomize = new Random();
        
        for(int i = 0; i< list.length; i++){

        int number = randomize.nextInt(101);

        list[i] = number;
        }
        return list;
    }
    public static ArrayList<Integer> printSum(ArrayList<Integer> randomInput){

        int even = 0;
        int odd = 0;

        Integer[] randomIntegers2 = new Integer[2] ;

        for(int i = 0; i < randomInput.length; i++){
            if(i % 2 == 0){
                even += randomInput[i];
            }else{
                odd += randomInput[i];
            }
        }

        randomIntegers2[0] = odd;
        randomIntegers2[1] = even;

        return randomIntegers2;
    }



    public static int findMax (Integer[] givenArray){
        
        //defining temporary max value 
        int max = givenArray[0];

        for(int m = 0 ; m < givenArray.length ; m++ ){

            if(givenArray[m] > max){
                max = givenArray[m];
            }
        }
        
        return max;

    }
    
    public static int findMin (Integer[] givenArray){

        int min = givenArray[0];

        for (int i = 0 ; i < givenArray.length ; i++){

            if(givenArray[i] < min){
                
                min = givenArray[i]; 
            }

        }
        return min;

    }
     
    
    public static Double[] averageDifference (Integer[] arr1){
        double average;
        double sum = 0;
        Double[] arr2 = new Double[arr1.length];

        for(int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }

        average = sum / arr1.length;

        for(int j = 0; j < arr1.length; j++){
            double difference = arr1[j] - average;
            arr2[j] = difference;
        }

        return arr2;
    
    }

    
}