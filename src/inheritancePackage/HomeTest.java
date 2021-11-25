package inheritancePackage;

import java.util.Scanner;

public class HomeTest {
    public static void main(String[] args) {
    // Runner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter room name: ");
        String roomName= sc.nextLine();
        System.out.println("Enter number of lights in the room: ");
        int noOfLights = sc.nextInt();

        if (roomName.equalsIgnoreCase("Kitchen")){
            Kitchen kitchen=new Kitchen();
            kitchen.numOfLights(roomName,noOfLights);
        }else if (roomName.equalsIgnoreCase("Bedroom")){
            Bedroom bedroom=new Bedroom();
            bedroom.numOfLights(roomName, noOfLights);
        }else if (roomName.equalsIgnoreCase("Hall")){
            Hall hall=new Hall();
            hall.numOfLights(roomName, noOfLights);
        }else if (roomName.equalsIgnoreCase("Hall")){
            Bathroom bathroom=new Bathroom();
            bathroom.numOfLights(roomName, noOfLights);
        }else{
            System.out.println("Incorrect room name");
        }
    }

}
