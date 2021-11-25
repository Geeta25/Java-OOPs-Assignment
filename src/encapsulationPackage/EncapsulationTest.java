package encapsulationPackage;

import java.util.ArrayList;

public class EncapsulationTest {
    public static void main(String[] args) {

        //Print college names(any 5 colleges) and departments - IT , CS , MECH , ECE , EEE , AERO , AUTO , EI
        EncapClass college1 = new EncapClass();
        EncapClass college2 = new EncapClass();
        EncapClass college3 = new EncapClass();
        EncapClass college4 = new EncapClass();
        EncapClass college5 = new EncapClass();

        ArrayList<String> collegeDepartment = new ArrayList<String>();

        collegeDepartment.add("IT");
        collegeDepartment.add("CS");
        collegeDepartment.add("MECH");
        collegeDepartment.add("ECE");
        collegeDepartment.add("AERO");
        collegeDepartment.add("AUTO");
        collegeDepartment.add("EI");

        college1.setCollegeName("BITS Pilani");
        college1.setCollegeDepartment(collegeDepartment);
        System.out.println("College name: " + college1.getCollegeName());
        System.out.println("Departments: " + college1.getCollegeDepartment());

        college2.setCollegeName("Roorkee");
        System.out.println("College name: " + college2.getCollegeName());
        System.out.println("Departments: " + college1.getCollegeDepartment());

        college3.setCollegeName("NIIT Trichi");
        System.out.println("College name: " + college3.getCollegeName());
        System.out.println("Departments: " + college1.getCollegeDepartment());

        college4.setCollegeName("RGPV,");
        System.out.println("College name: " + college4.getCollegeName());
        System.out.println("Departments: " + college1.getCollegeDepartment());

        college5.setCollegeName("HCET");
        System.out.println("College name: " + college5.getCollegeName());
        System.out.println("Departments: " + college1.getCollegeDepartment());
    }
}
