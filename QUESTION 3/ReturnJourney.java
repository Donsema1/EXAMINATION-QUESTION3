/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 
 */
public class ReturnJourney {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int speedKmPerHour = 250;
        int refuelStopDistance = 200;
        int stopTimeMinutes = 5;

        
        double travelTimeHours = (double) totalDistance / speedKmPerHour;

        
        int refuelStops = totalDistance / refuelStopDistance;

        
        double stopTimeHours = (refuelStops * stopTimeMinutes) / 60.0;

        
        double totalTime = travelTimeHours + stopTimeHours;

        System.out.println("Total time taken for return journey: " + totalTime + " hours");
    }
}
