package day48_Racap.PlanetsTask;

public class Planet {

    private final String name;
    private final double mass, radius, surfaceGravity, surfaceArea;
    private final int volume, population ;

    public Planet(String name, double mass, double radius, double surfaceGravity, double surfaceArea, int volume, int population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public int getVolume() {
        return volume;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
/*
1. create a class called Planet
			final private variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fileds

			methods:
				toString()
 */