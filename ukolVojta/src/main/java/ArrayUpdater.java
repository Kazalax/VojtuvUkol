import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUpdater {
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addNumbers() {
        System.out.println("Enter max 5 numbers");
        String input = scanner.nextLine();
        String[] inputs = input.split(",");

        for (String number : inputs) {
            if (numbers.size() == 5) {
                break;
            }

            try {
                numbers.add(Integer.parseInt(number.trim()));
            } catch (NumberFormatException e) {
                System.out.println(number + " is not a valid number");
            }
        }
        System.out.println("Array contains:");
        for(Integer number : numbers){
            System.out.print(number + " ");
        }
    }
    public void getNumbersHigher(){
        ArrayList<Integer> higherNumbers = new ArrayList<>();
        for (Integer number : numbers) {
           higherNumbers.add(number + 5);
        }

        System.out.println("\nYour numbers bigger by 5:");
        for(Integer highernumber : higherNumbers){
            System.out.print(highernumber + " ");
        }
    }
}