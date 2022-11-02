import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirtf;

    public Person(String firstName, String lastName, LocalDate dateOfBirtf){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirtf = dateOfBirtf;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirtf() {
        return dateOfBirtf;
    }

    public void setDateOfBirtf(LocalDate dateOfBirtf) {
        this.dateOfBirtf = dateOfBirtf;
    }

}
