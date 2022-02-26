import java.util.List;

public class Hospital{
    public String name;
    public String location;
    public List<Department> department_list;

    //set Hospital Details
    public void setHospitalDetails(String name, String location, List<Department> department_list){
        this.name = name;
        this.location = location;
        this.department_list = department_list;
    }

    //get Hospital Details
    public String getHospitalDetails(){
        return  ("Hospital Name: " + this.name + "\nHospital Location: " + this.location + "\nList of Departments: ");
    }
}

