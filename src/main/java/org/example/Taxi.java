package org.example;
import org.apache.commons.math3.analysis.function.Multiply;
import org.joda.time.DateTime;
import org.joda.time.Duration;

public class Taxi {


    private boolean isBooked;
    private double baseFare = 5;
    private double farePerMinute = 0.5; private double nightTimeFactor = 1.5;
    public boolean isBooked() { return isBooked;
    }
    public void setBooked(boolean booked) { isBooked = booked;
    }
    public double calcCost(DateTime startTime, DateTime endTime) {
        boolean isNight = startTime.isAfter(6);
        Duration duration = new Duration(endTime, startTime);
        Multiply multiply = new Multiply();
        double timeCost = multiply.value(duration.getStandardMinutes(), farePerMinute);
        double totalCost = isNight ? timeCost + baseFare * nightTimeFactor: timeCost + baseFare;
        return totalCost; }
}