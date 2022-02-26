import java.util.List;

public class Department{

    // Instance Variables
    public String name;
    public String building;
    public String head_of_department;
    public List<Employee> employee_list;

    //set Department details
    public void setDepartmentDetails(String name, String building, String head_of_department, List<Employee> employee_list)
    {
        this.name = name;
        this.building = building;
        this.head_of_department = head_of_department;
        this.employee_list = employee_list;
    }

    //get Department details
    public String getDepartmentDetails()
    {
        return("Department Name: " + this.name + "\nDepartment Building: " + this.building +
        "\nHead of Department: " + this.name + "\nEmployee List: ");
    }

}




