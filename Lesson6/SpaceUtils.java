package com.PetroP.Lesson6;

/*
 * Создать утилитный класс* SpaceUtils со следующими статическими методами:
 * - Принимающий 2 космический объекта и определяющий силу гравитации между ними
 * (можно придумать любую формула на основании расстоянии между объектами и т.д.)
 * - Принимающий космический объект и определяющий, является ли он звездой или нет*/
public abstract class SpaceUtils extends SpaceObject {

    public SpaceUtils(String name, Weight weight, DistanceToSun distanceToSun) {
        super(name, weight, distanceToSun);
    }

    static double calculateGravityBetweenObjects(SpaceObject spaceObject, SpaceObject spaceObject1) {
        double result = Math.abs(spaceObject.getDistanceToSun().getValue() - spaceObject1.getDistanceToSun().getValue()
                * (spaceObject.getWeight().getValue() + spaceObject1.getWeight().getValue())) * 0.00001;
        System.out.println(result);
        return result;
    }

    static boolean isStar(SpaceObject spaceObject) {
        return spaceObject.getName().equals("Звезда") || spaceObject.getName().equals("Солнце");
    }
}
