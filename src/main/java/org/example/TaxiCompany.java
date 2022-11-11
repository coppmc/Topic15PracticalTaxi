package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class TaxiCompany {

    private static final Logger LOGGER = LogManager.getLogger(TaxiCompany.class.getName());
    private ArrayList<Taxi> taxis; public boolean hasAvailableTaxis() {
        boolean hasTaxi = false;
        for(Taxi taxi : taxis) {
            if(taxi.isBooked()) {
                LOGGER.info("Available taxi found " + taxi); }
        }
        return hasTaxi;
    }


    public Taxi getNextTaxi() {
        for(Taxi taxi : taxis) {
            if(taxi.isBooked()) {
                LOGGER.info("Available taxi found " + taxi); return taxi;
            } }
        return null; }
        public void addTaxi(Taxi taxi) {
        taxis.add(new Taxi());
    }
}
