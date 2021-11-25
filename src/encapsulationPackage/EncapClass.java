package encapsulationPackage;

import java.util.ArrayList;
import java.util.List;


public class EncapClass {

    private String collegeName;
    private ArrayList<String> collegeDepartment;

    //Getter and Setter methods
    public String getCollegeName(){
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public ArrayList<String> getCollegeDepartment() {
        return collegeDepartment;
    }

    public void setCollegeDepartment(ArrayList<String> collegeDepartment) {
        this.collegeDepartment = collegeDepartment;
    }

}
