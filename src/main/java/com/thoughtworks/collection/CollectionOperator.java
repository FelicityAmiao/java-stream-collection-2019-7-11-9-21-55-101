package com.thoughtworks.collection;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = IntStream.range(Math.min(left, right), Math.max(left, right) + 1).boxed().collect(Collectors.toList());
        if(left > right) Collections.reverse(result);
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = IntStream.range(Math.min(left, right), Math.max(left, right) + 1).boxed().filter(item -> item % 2 == 0).collect(Collectors.toList());
        if(left > right) Collections.reverse(result);
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(item -> item % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toList()).get(array.length-1);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
