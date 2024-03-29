
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

//            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

//            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
//            System.out.print("Identification number: ");
            String ID = scanner.nextLine();

            PersonalInformation person = new PersonalInformation(firstName, lastName, ID);

            infoCollection.add(person);
        }
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
