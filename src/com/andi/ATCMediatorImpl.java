package com.andi;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {

    private List<AirCraft> aircraftList;

    public ATCMediatorImpl() {
        this.aircraftList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, AirCraft airCraft) {
        for (AirCraft a: aircraftList){
            if(a != airCraft) {
                a.receive(msg);
            }
        }
    }

    @Override
    public void addAirCraft(AirCraft airCraft) {
        this.aircraftList.add(airCraft);
    }
}
