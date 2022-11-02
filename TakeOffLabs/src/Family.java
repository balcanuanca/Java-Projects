import java.util.ArrayList;
import java.util.Comparator;

public class Family {

    private String lastName;
    private ArrayList<Person> members = new ArrayList<Person>();

    public String getLastName() {
        return lastName;
    }

    public Family (String lastName){
        this.lastName = lastName;
    }

    public void addPerson (Person newPerson){
        this.members.add(newPerson);
    }
    public int getSize(){
        return this.members.size();
    }

    public void familyMembersSorted(){
        members.sort(new SortByDateOfBirth());
    }

    public String toString(){
        String s = this.lastName;
        s = s + ":";
        for (Person p : this.members){
            s = s + " " + p.getFirstName();
        }
        return s;
    }
}
