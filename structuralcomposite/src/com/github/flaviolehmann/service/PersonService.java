package com.github.flaviolehmann.service;

import com.github.flaviolehmann.service.dto.PersonDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class PersonService {

    public void showHierarchy(PersonDTO personDTO) {
        showHierarchy(personDTO, new ArrayList<>(Collections.singletonList(1)));
    }

    private void showHierarchy(PersonDTO personDTO, List<Integer> treePositions) {
        printLine(personDTO, treePositions);
        advanceToNextLine(personDTO, treePositions);
    }

    private void advanceToNextLine(PersonDTO personDTO, List<Integer> treePositions) {
        AtomicInteger childrenIndex = new AtomicInteger(1);
        personDTO.getSubordinates().forEach(subordinate -> {
            List<Integer> clonedTreePositions = new ArrayList<>(treePositions);
            clonedTreePositions.add(childrenIndex.getAndIncrement());
            showHierarchy(subordinate, new ArrayList<>(clonedTreePositions));
        });
    }

    private void printLine(PersonDTO personDTO, List<Integer> treePositions) {
        printPersonIndex(treePositions);
        printTreeIndentation(treePositions.size());
        printPersonIdentifier(personDTO);
    }

    private void printPersonIdentifier(PersonDTO personDTO) {
        System.out.println(personDTO.getIdentifier());
    }

    private void printPersonIndex(List<Integer> treePositions) {
        String personIndex = treePositions.stream().map(Object::toString).collect(Collectors.joining("."));
        System.out.printf("%-10s | ", personIndex);
    }

    private void printTreeIndentation(Integer treeDeepness) {
        while (--treeDeepness > 0) {
            System.out.print("\t");
        }
    }
}
