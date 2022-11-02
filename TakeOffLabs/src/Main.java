import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Mihai", "Enescu", LocalDate.of(1980,1,2)));
        persons.add(new Person("George","Ionescu",LocalDate.of(1992,6,20)));
        persons.add(new Person("Maria", "Popescu", LocalDate.of(1995,3,13)));
        persons.add(new Person("Elena","Popescu",LocalDate.of(1990,12,13)));
        persons.add(new Person("Andrei", "Ionescu", LocalDate.of(1996,3,1)));
        persons.add(new Person("Sergiu","Ionescu",LocalDate.of(1990,2,1)));

        HashMap<String,Family> families = new HashMap<String, Family>();

        for(Person p : persons){
            if(families.get(p.getLastName()) != null){
                families.get(p.getLastName()).addPerson(p);
            } else {
                Family newFamily = new Family(p.getLastName());
                newFamily.addPerson(p);
                families.put(newFamily.getLastName(), newFamily);
            }
        }

        ArrayList<Family> familiesArray = new ArrayList<Family>();

        for(Family f : families.values()){
            f.familyMembersSorted();
            familiesArray.add(f);
        }

        familiesArray.sort(new SortByFamilySize());

        for(Family f : familiesArray){
            System.out.println(f);
        }
    }
}