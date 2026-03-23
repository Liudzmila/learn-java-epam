package main.java.com.epam.learn.designpatterns.behavioral.mediator;

public class Mediator {

    private final TrafficLight trafficLight;
    private final PedestrianCrossingLight pedestrianCrossingLight;

    public Mediator(TrafficLight trafficLight, PedestrianCrossingLight pedestrianCrossingLight) {
        this.trafficLight = trafficLight;
        this.pedestrianCrossingLight = pedestrianCrossingLight;
    }

    public void changeTrafficLightToGreen() {
        pedestrianCrossingLight.changeToRed();
        trafficLight.changeToGreen();
    }

    public void changeTrafficLightToRed() {
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeTrafficLightToAmber() {
        trafficLight.changeToAmber();
    }
}
