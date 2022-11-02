import java.util.Comparator;

public class SortByDateOfBirth implements Comparator<Person> {

    public int compare(Person a, Person b){
        return a.getDateOfBirtf().compareTo(b.getDateOfBirtf());
    }
}
