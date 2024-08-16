/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *

 */
public class TravelTime {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int speedKmPerHour = 250;
        int stopTimeMinutes = 5;

       
        double travelTimeHours = (double) totalDistance / speedKmPerHour;

        
        int passengerStops = totalDistance / 150;
        int refuelStops = totalDistance / 200;

       
        int commonStops = totalDistance / (150 * 200);

        int totalStops = passengerStops + refuelStops - commonStops;

        
        double stopTimeHours = (totalStops * stopTimeMinutes) / 60.0;

       
        double totalTime = travelTimeHours + stopTimeHours;

        System.out.println("Total time taken: " + totalTime + " hours");
    }
}

