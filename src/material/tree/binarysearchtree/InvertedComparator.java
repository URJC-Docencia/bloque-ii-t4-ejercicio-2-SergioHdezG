package material.tree.binarysearchtree;

import java.util.Comparator;

public class InvertedComparator<E> implements Comparator<E> {

    /**
     * Compares two given elements
     *
     * @param a
     * @param b
     * @return a negative integer if <tt>a</tt> is less than <tt>b</tt>, zero if
     * <tt>a</tt> equals <tt>b</tt>, or a positive integer if
     * <tt>a</tt> is greater than <tt>b</tt>
     */

    @Override
    public int compare(E a, E b) throws ClassCastException {
        return -((Comparable<E>) a).compareTo(b);
    }
}
