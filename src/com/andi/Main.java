package com.andi;

public class Main {

    public static void main(String[] args) {


        ATCMediator mediator = new ATCMediatorImpl();

        //create a few aircrafts
        AirCraft boing1 = new AirCraftImpl(mediator, "Boing 1");
        AirCraft boing2 = new AirCraftImpl(mediator, "Boing 2");
        AirCraft boing3 = new AirCraftImpl(mediator, "Boing 3");
        AirCraft boing4 = new AirCraftImpl(mediator, "Boing 4");

        //adding aircrafts to the mediator
        mediator.addAirCraft(boing1);
        mediator.addAirCraft(boing2);
        mediator.addAirCraft(boing3);
        mediator.addAirCraft(boing4);

        boing1.send("Hello from Boing 1");
    }
}
