
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamba
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);

    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Person> getPersons() {

        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortest = persons.get(0);
        for (Person person : persons) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take(){
         if (persons.isEmpty()) {
            return null;
        }
          ArrayList <Person> list = new ArrayList<>();
          list.add(shortest());
          persons.remove(shortest());
          return list.get(0);
         
    }

}
