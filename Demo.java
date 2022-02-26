import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo{
    public static void main(String args[]){

        //Instance of Building object
        Building B1 = new Building();
        B1.setBuildingDetails("Jaslok Hospital","Building-01","Peddar Road", 10, "1.3 Acre");
   
        //Instance of MedicalStaff object
        MedicalStaff M1 = new MedicalStaff();
        M1.setEmployeeDetails( 
        "Arjun",
        "Male",
        LocalDate.now(),
        "EmpNo.0001",
        "Cardiology",
        "Senior Surgeon",
        "dr_arjun.h@gmail.com",
        "+9875735729",
        "Rs.52.87L",
        "Cardiologist",
        "Reg67938ft",
        "12 Years",
        true,
        false);

        MedicalStaff M2 = new MedicalStaff();
        M2.setEmployeeDetails( 
        "Jay",
        "Male",
        LocalDate.now(),
        "EmpNo.0002",
        "Radiology",
        "Senior Radiologist",
        "drjay85@hotmail.com",
        "+987748599",
        "Rs.35.25L",
        "Radiologist",
        "Reg65908kj",
        "7 Years",
        true,
        false);

        //Instance of NonMedicalStaff object
        NonMedicalStaff NM1 = new NonMedicalStaff();
        NM1.setEmployeeDetails(
            "Anuja",
            "Female",
            LocalDate.now(),
            "EmpNo.0003",
            "Cardiology",
            "Nurse",
            "nurse_anuja.s@gmail.com",
            "+9865850585",
            "Rs.3.87L",
            true,
            false
        );

        NonMedicalStaff NM2 = new NonMedicalStaff();
        NM2.setEmployeeDetails(
            "Rekha",
            "Female",
            LocalDate.now(),
            "EmpNo.0004",
            "Radiology",
            "Manager",
            "rekha.s@gmail.com",
            "+9875950989",
            "Rs.5.25L",
            false,
            true
        );

        //Cardiology department employees
        List<Employee> card_employee_list = new ArrayList<Employee>();
        card_employee_list.add(M1);
        card_employee_list.add(NM1);

        //Radiology department employees
        List<Employee> rad_employee_list = new ArrayList<Employee>();
        rad_employee_list.add(M2);
        rad_employee_list.add(NM2);


        //Instance of Department object
        Department D1 = new Department();
        Department D2 = new Department();
        D1.setDepartmentDetails("Cardiology", "Building-01", "Arjun", card_employee_list);
        D2.setDepartmentDetails("Radiology", "Building-02", "Jay", rad_employee_list);

        List<Department> department_list = new ArrayList<Department>();
        department_list.add(D1);
        department_list.add(D2);

        //Instance of Hospital object
        Hospital H1 = new Hospital();
        H1.setHospitalDetails("Jaslok Hospital", "Malbar Hills", department_list);
        System.out.println("Hospital Details: ");
        System.out.println(H1.getHospitalDetails());

        System.out.println("\nBuilding Details: ");
        System.out.println(B1.getbuildingDetails());
        
        System.out.println("\nDepartment Details: ");
        int count1 = 1;
        for (Department department : department_list) {
             System.out.println("\nDepartment " + count1 + ".\n" + department.getDepartmentDetails());  
             int count2 = 1;
             for (Employee employee : department.employee_list) {
                  System.out.println("\n" + count2 + ".\n" + employee.getEmployeeDetails());  
                  count2++;  
             }
             count1++;  
        }
       
    }
}