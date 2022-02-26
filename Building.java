public class Building{
    
    // Instance Variables
    public String name;
    public String buildingCode;
    public String location;
    public int no_of_floors;
    public String totalArea;

    //set building details
    public void setBuildingDetails(String name, String buildingCode, String location, int no_of_floors, String totalArea){
        this.name = name;
        this.buildingCode = buildingCode;
        this.location = location;
        this.no_of_floors = no_of_floors;
        this.totalArea = totalArea;
    }

    //get building details
    public String getbuildingDetails()
    {
        return("Name: " + this.name +
               "\nBuilding Code: " + this.buildingCode +
               "\nLocation: " + this.location +
               "\nNo. of Floors: " + this.no_of_floors +
               "\nTotal Area: " + this.totalArea );
    }

}