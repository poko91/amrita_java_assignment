import java.time.LocalDate;

public class Person{

    // Instance Variables
    public String name;
    public String gender;
    public LocalDate date_of_birth;

    //set set Person details
    public void setPersonalDetails(String name, String gender, LocalDate date_of_birth){
        this.name = name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
    }

    //get set Person details
    public String getPersonDetails(){
        return ("Name: " + this.name+ "\nGender: " + this.gender + "\nDate of Birth: " + this.date_of_birth);
    }
}



