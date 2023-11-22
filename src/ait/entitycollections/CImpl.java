package ait.entitycollections;

import ait.entitycollections.interfaces.Entity;
import ait.entitycollections.interfaces.EntityCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CImpl implements EntityCollection {

    ArrayList<Entity> arrayList = new ArrayList<>();
    Comparator<Entity> comparator = (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue());

    // O(n)
    @Override
    public void add(Entity entity) {
        if (entity == null) {
            throw new NullPointerException();
        }
        int index = Collections.binarySearch(arrayList, entity, comparator);
        if (index >= 0) {
            return;
        }
        arrayList.add(-index - 1, entity);
    }
    // O(1)
    @Override
    public Entity removeMaxValue() {
        return arrayList.remove(arrayList.size()-1);
    }
}
