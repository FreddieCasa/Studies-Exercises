
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("Give two indices to swap: ");
        int firstIndex = Integer.parseInt(scanner.nextLine());
        int secondIndex = Integer.parseInt(scanner.nextLine());
        int[] copied = new int[5];
//        System.arraycopy(array,0,copied,2,1);
        System.arraycopy(array, 0, copied, 0, 5);
        array[firstIndex] = copied[secondIndex];
        array[secondIndex] = copied[firstIndex];


//        if(array[0] == array[firstIndex] && array[3] == array[secondIndex]){
//
//        }

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

//        System.out.println("");
//        index = 0;
//        while (index < copied.length) {
//            System.out.println(copied[index]);
//            index++;
//        }
    }

}
