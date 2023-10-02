package com.PetroP.Lesson6;

abstract public class SpaceObject {

    private final String name;
    private final Weight weight;
    private DistanceToSun distanceToSun;

    public SpaceObject(String name, Weight weight, DistanceToSun distanceToSun) {
        this.name = name;
        this.weight = weight;
        this.distanceToSun = distanceToSun;
    }

    public SpaceObject(String name, Weight weight) {
        this.name = name;
        this.weight = weight;
    }

    public DistanceToSun getDistanceToSun() {
        return distanceToSun;
    }

    public String getName() {
        return name;
    }

    public Weight getWeight() {
        return weight;
    }

    public int calculateDiameter() {
        return Math.abs(((distanceToSun.getValue() * 140) / weight.getValue() * 12));
    }


    static void printDiam(SpaceObject... spaceObjects) {
        for (SpaceObject spaceObject : spaceObjects) {
            System.out.println(spaceObject.calculateDiameter());
        }
    }

    static void printToString(SpaceObject... spaceObjects) {
        for (SpaceObject spaceObject : spaceObjects) {
            System.out.println(spaceObject.toString());
        }
    }

    public void compareWeight(SpaceObject spaceObjects, SpaceObject spaceObjects1) {
        if (spaceObjects.weight.getValue() > spaceObjects1.getWeight().getValue())
            System.out.println("Масса объекта " + spaceObjects.getName() + " больше, чем у объекта "
                    + spaceObjects1.getName());
        else System.out.println("Масса объекта " + spaceObjects1.getName() + " больше, чем у объекта "
                + spaceObjects.getName());
    }
}





