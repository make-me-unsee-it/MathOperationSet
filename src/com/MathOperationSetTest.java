package com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class MathOperationSetTest {
    private HashSet firstSet;
    private HashSet secondSet;

    @Before
    public void setUp() {
        firstSet = new HashSet();
        firstSet.add("A");
        firstSet.add("B");
        secondSet = new HashSet();
        secondSet.add("B");
        secondSet.add("C");
    }

    @After
    public void tearDown() {
        firstSet = null;
        secondSet = null;
    }

    @Test
    public void testUnion() {
        HashSet expected = MathOperationSet.union(firstSet, secondSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("A");
        actual.add("B");
        actual.add("C");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIntersection() {
        HashSet expected = MathOperationSet.intersection(firstSet, secondSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("B");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDifference() {
        HashSet expected = MathOperationSet.difference(firstSet, secondSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("A");
        actual.add("C");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinus() {
        HashSet expected = MathOperationSet.minus(firstSet, secondSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("A");
        Assert.assertEquals(expected, actual);
    }
}