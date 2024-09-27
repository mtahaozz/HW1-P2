package HW1P2;
import java.util.Scanner;
import java.util.Random;

public class ArrayWizardApplication{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int size;
        int choice;
        Integer[] userArray;
        boolean check = true;
        
        System.out.println("Welcome to the Array Wizard!");
        System.out.println("Please enter the size of your desired array.");

        size = scanner.nextInt();
        userArray = createArray(size); // createArray is the method that creates desired array.

        System.out.print("Your array is: ");
        for (int i = 0; i < userArray.length; i++) {

            System.out.print(userArray[i] + " ");
            
        }

        while (check) 
        {    
            System.out.println("*************** MENU ***************");
            System.out.println("1 - Display maximum of the array.");
            System.out.println("2 - Display minimum of the array.");
            System.out.println("3 - Display average difference of the array.");
            System.out.println("4 - Display sum of elements with odd and even numbered indexes.");// This option can be seperated in to two options.
            System.out.println("5 - Exit.");
            System.out.println();

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice == 1) 
            {
                System.out.println("Maximum of the array is: " + findMax(userArray));
            }
            if (choice == 2) 
            {
                System.out.println("Minimum of the array is: " + findMin(userArray));
            }
            if (choice == 3) 
            {
                System.out.println("Average distance of array is: ");
                Double[] average = averageDifference(userArray);
                
                for (int i = 0; i < average.length; i++) {
                    System.out.print(average[i] + " ");
                }
            }
            if (choice == 4) 
            {
                Integer[] sum = printSum(userArray);

                System.out.println("Sum of elements with odd numbered indexes: " + sum[0]);
                System.out.println("Sum of elements with even numbered indexes: " + sum[1]);
            }
            if (choice == 5) 
            {
                check = false;
            }
        }

    }
    
}