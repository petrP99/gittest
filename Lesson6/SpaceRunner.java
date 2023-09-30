package com.PetroP.Lesson6;

public class SpaceRunner {
    public static void main(String[] args) {
        SpaceObject earth = new Earth("Земля",new Weight(1255),new DistanceToSun(5000));
        SpaceObject star = new Star("Звезда",new Weight(105),new DistanceToSun(800));
        SpaceObject sun = new Sun("Солнце",new Weight(10015));
        SpaceObject asteroid = new Asteroid("Астероид",new Weight(10015), new DistanceToSun(5000));





    }

}
