package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(item -> item * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return (List<String>) array.stream().map(item -> String.valueOf(Character.toChars(item + 96))).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        array.sort((a, b) -> a > b? -1: a == b? 0: 1);
        return array;
    }

    public List<Integer> sortFromSmall() {
        array.sort((a, b) -> a > b? 1: a == b? 0: -1);
        return array;
    }
}
