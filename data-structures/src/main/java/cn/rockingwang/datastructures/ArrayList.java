package cn.rockingwang.datastructures;

import java.util.List;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPATICY = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    private static final Object[] DEFAULTCAPATICY_EMPTY_ELEMENTDATA = {};

    transient Object[] elementData;
    private int size;

    public ArrayList() {
        this.elementData = DEFAULTCAPATICY_EMPTY_ELEMENTDATA;
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        }
    }

}
