package com.PetroP.Lesson6;

public class Asteroid extends SpaceObject{

    private int timeToImpact;
    private double speed;


    public Asteroid(String name, Weight weight, DistanceToSun distanceToSun) {

        super(name, weight, distanceToSun);
    }

    // рандомное условие высчитывание скорости астероида
    public double getSpeed() {
        return Math.cos(getWeight().getValue());
    }

    // рандомное условие высчитывание времени до столкновения
    public int getTimeToImpact() {
        if (getDistanceToSun().getValue() < 1000)
            return (int) (getDistanceToSun().getValue() * getSpeed());
        else return (int) (getDistanceToSun().getValue() * getSpeed() * 2.58);
    }


    void calculateTimeToDie() {
        while (timeToImpact > 0) {
            timeToImpact = timeToImpact / 100;
            System.out.println("Время до столкновения с землей: " + timeToImpact);
        }
        System.out.println("Астероид столкнулся с землей!");
    }

    @Override
    public int calculateDiameter() {
        return super.calculateDiameter();
    }

    
}
