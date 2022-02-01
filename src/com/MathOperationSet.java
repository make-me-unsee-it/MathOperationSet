package com;

import java.util.HashSet;

public class MathOperationSet {
    private MathOperationSet() {
    }

    public static HashSet union (HashSet firstSet, HashSet secondSet) {
        firstSet.addAll(secondSet);
        return firstSet;
    }

    public static HashSet intersection (HashSet firstSet, HashSet secondSet) {
        HashSet result = new HashSet();
        for (Object set: firstSet) {
            if (secondSet.contains(set)) result.add(set);
        }
        return result;
    }

    public static HashSet minus (HashSet firstSet, HashSet secondSet) {
        HashSet result = new HashSet();
        for (Object set: firstSet) {
            if (!secondSet.contains(set)) result.add(set);
        }
        return result;
    }

    public static HashSet difference (HashSet firstSet, HashSet secondSet) {
        HashSet result = new HashSet();
        for (Object set: firstSet) {
            if (!secondSet.contains(set)) result.add(set);
        }
        for (Object set: secondSet) {
            if (!firstSet.contains(set)) result.add(set);
        }
        return result;
    }
}

