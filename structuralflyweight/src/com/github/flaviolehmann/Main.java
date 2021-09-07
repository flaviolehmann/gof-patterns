package com.github.flaviolehmann;

import com.github.flaviolehmann.domain.Car;
import com.github.flaviolehmann.domain.Model;
import com.github.flaviolehmann.service.factory.ModelFlyweightFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Main {

    private final List<Integer> avaiableModelYears = new ArrayList<>(Arrays.asList(2019, 2020, 2021));
    private final List<String> avaiableModelDescriptions = new ArrayList<>(Arrays.asList("Chev Cruze", "HB20", "Fiat Toro"));
    private final List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        generateLotsOfCars(1000);
        System.out.println("Car objects: " + Car.getInstancesCount());
        System.out.println("Model objects: " + Model.getInstancesCount());
    }

    private void generateLotsOfCars(Integer numberOfCars) {
        while (--numberOfCars >= 0) {
            Model model = ModelFlyweightFactory.createModel(getRandomYear(), getRandomDescription());
            Car car = new Car(UUID.randomUUID().toString(), model);
            cars.add(car);
        }
    }

    public Integer getRandomYear() {
        Random rand = new Random();
        return avaiableModelYears.get(rand.nextInt(avaiableModelYears.size()));
    }

    public String getRandomDescription() {
        Random rand = new Random();
        return avaiableModelDescriptions.get(rand.nextInt(avaiableModelDescriptions.size()));
    }
}
