import java.util.ArrayList;

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

    public static Integer[] getSumOfEvenAndOdds(Integer[] randomInput){

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