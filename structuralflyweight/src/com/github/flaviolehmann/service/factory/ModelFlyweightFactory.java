package com.github.flaviolehmann.service.factory;

import com.github.flaviolehmann.domain.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ModelFlyweightFactory {

    private static final List<Model> models = new ArrayList<>();

    public static Model createModel(Integer year, String description) {
        Optional<Model> modelInMemory = getModelInMemory(year, description);
        return modelInMemory.orElseGet(() -> {
            Model newModel = new Model(year, description);
            models.add(newModel);
            return newModel;
        });
    }

    private static Optional<Model> getModelInMemory(Integer year, String description) {
        return models.stream()
                .filter(model -> model.getYear().equals(year) && model.getDescription().equals(description))
                .findFirst();
    }

}
