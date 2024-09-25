import java.util.Scanner;

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

        System.out.println("Your array is: " + userArray.toString());

        while (check) 
        {    
            System.out.println("*************** MENU ***************");
            System.out.println("1 - Display maximum of the array.");
            System.out.println("2 - Display minimum of the array.");
            System.out.println("3 - Display average of the array.");
            System.out.println("4 - Display sum of elements with odd and even numbered indexes.");// This option can be seperated in to two options.
            System.out.println("5 - Exit.");
            System.out.println();

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice == 1) 
            {
                
            }
            if (choice == 2) 
            {
                
            }
            if (choice == 3) 
            {
                
            }
            if (choice == 4) 
            {
                
            }
            if (choice == 5) 
            {
                check = false;
            }
        }

    }
    
}