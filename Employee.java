import java.time.LocalDate;

abstract class Employee extends Person {

    // Instance Variables
    public String employee_id;
    public String department;
    public String designation;
    public String email_id;
    public String phone_number;
    public String salary;

    //abstract method
    abstract String getEmployeeDetails();
}

class MedicalStaff extends Employee {

    // Instance Variables
    public String specialization;
    public String reg_number;
    public String years_of_medical_experience;
    public Boolean is_doctor;
    public Boolean is_visiting_consultant;

    //set Medical employee details
    public void setEmployeeDetails(String name, String gender, LocalDate date_of_birth,
            String employee_id, String department, String designation,
            String email_id, String phone_number, String salary, String specialization, String reg_number,
            String years_of_medical_experience,
            Boolean is_doctor, Boolean is_visiting_consultant) {
        super.name = name;
        super.gender = gender;
        super.date_of_birth = date_of_birth;
        super.employee_id = employee_id;
        super.department = department;
        super.designation = designation;
        super.email_id = email_id;
        super.phone_number = phone_number;
        super.salary = salary;
        this.specialization = specialization;
        this.reg_number = reg_number;
        this.years_of_medical_experience = years_of_medical_experience;
        this.is_doctor = is_doctor;
        this.is_visiting_consultant = is_visiting_consultant;
    }

    //method to check if Doctor or Visiting Staff
    public String doctorOrVisting(){
        if (this.is_doctor){
            return "Doctor";
        } else {
            return "Visiting Consultant";
        }
    }

    //get Medical Employee details
    public String getEmployeeDetails() {
        return ("Name: " + super.name + "\nGender: "+ super.gender + "\nDate of Birth: " + super.date_of_birth + 
                "\nEmployee Id: " + super.employee_id +
                "\nDepartment: " + super.department + "\nDesignation" + super.designation +
                "\nEmail Id: " + super.email_id + "\nPhone Number: " + super.phone_number +
                "\nSalary: " + super.salary + "\nSpecialization: " + this.specialization +
                "\nRegistration Number: " + this.reg_number +
                "\nYears of Experience: " + this.years_of_medical_experience +
                "\n" + doctorOrVisting());
    }
}

class NonMedicalStaff extends Employee {
    // Instance Variables
    public Boolean is_administrative_staff;
    public Boolean is_manager;

    // set NonMedical employee details
    public void setEmployeeDetails(String name, String gender, LocalDate date_of_birth,
            String employee_id, String department, String designation,
            String email_id, String phone_number, String salary,
            Boolean is_administrative_staff, Boolean is_manager) {
        super.name = name;
        super.gender = gender;
        super.date_of_birth = date_of_birth;
        super.employee_id = employee_id;
        super.department = department;
        super.designation = designation;
        super.email_id = email_id;
        super.phone_number = phone_number;
        super.salary = salary;
        this.is_administrative_staff = is_administrative_staff;
        this.is_manager = is_manager;
    }

    //method to check if Administrative Staff or Manager
    public String staff(){
        if (this.is_administrative_staff){
            return "Administrative staff";
        } else {
            return "Manager";
        }
    }

    // get NonMedical employee details
    public String getEmployeeDetails() {
        return ("Name: " + super.name + "\nGender: "+ super.gender + "\nDate of Birth: " + super.date_of_birth + 
                "\nEmployee Id: " + super.employee_id +
                "\nDepartment: " + super.department + "\nDesignation" + super.designation +
                "\nEmail Id: " + super.email_id + "\nPhone Number: " + super.phone_number +
                "\nSalary: " + super.salary + "\n" + staff());
    }

}
