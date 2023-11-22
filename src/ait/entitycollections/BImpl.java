package ait.entitycollections;

import ait.entitycollections.interfaces.Entity;
import ait.entitycollections.interfaces.EntityCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class BImpl implements EntityCollection {
    Comparator<Entity> comparator=(e1, e2)->Integer.compare(e1.getValue(),e2.getValue());
    TreeSet<Entity> treeSet = new TreeSet<>(comparator);

    // O(log(n))
    @Override
    public void add(Entity entity) {
    treeSet.add(entity);
    }
    // O(log(n))
    @Override
    public Entity removeMaxValue() {
        return treeSet.pollLast();
    }
}
