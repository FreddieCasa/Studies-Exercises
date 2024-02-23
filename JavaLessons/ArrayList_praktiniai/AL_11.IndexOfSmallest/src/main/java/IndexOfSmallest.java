
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if (smallest > number){
                smallest = number;
            }
        }
        System.out.println("The smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++){

            if(list.get(i) == smallest){
                System.out.println(list.get(i) + " is at index " + i);
            }

        }

    }
}