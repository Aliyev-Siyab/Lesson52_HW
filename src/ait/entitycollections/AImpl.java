package ait.entitycollections;

import ait.entitycollections.interfaces.Entity;
import ait.entitycollections.interfaces.EntityCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class AImpl implements EntityCollection {
    HashSet<Entity> hashSet = new HashSet<>();
    Comparator<Entity> comparator=(e1,e2)->Integer.compare(e1.getValue(),e2.getValue());

    // O(1)
    @Override
    public void add(Entity entity) {
        hashSet.add(entity);
    }


    //O(n)
    @Override
    public Entity removeMaxValue() {
        Entity max = Collections.max(hashSet,comparator);
        hashSet.remove(max);
        return max;
    }
}
