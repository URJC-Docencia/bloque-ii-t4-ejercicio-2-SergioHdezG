
package material.tree.binarysearchtree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import material.Position;
import material.tree.binarytree.InorderBinaryTreeIterator;
import material.tree.binarytree.LinkedBinaryTree;

/**
 *
 * @author mayte
 * @param <E>
 */
public class LinkedBinarySearchTree<E> implements BinarySearchTree<E> {
    
    public LinkedBinarySearchTree(Comparator<E> c){
        throw new RuntimeException("Not implemented yet.");
    }
    
   public LinkedBinarySearchTree(){
       throw new RuntimeException("Not implemented yet.");
   }

    @Override
    public Position<E> find(E value) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Iterable<? extends Position<E>> findAll(E value) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Position<E> insert(E value) {
        throw new RuntimeException("Not implemented yet.");
    }

    private Position<E> sigueBuscando(E value, Position<E> p) {
        throw new RuntimeException("Not implemented yet.");
    }
    
     private Position<E> encuentraPos(E value, Position<E> p) {
         throw new RuntimeException("Not implemented yet.");
    }
     
    @Override
    public boolean isEmpty() {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public void remove(Position<E> pos) {
        throw new RuntimeException("Not implemented yet.");
    }
    
    public Position<E> succesor(Position<E> pos){
        throw new RuntimeException("Not implemented yet.");
    }

    private Position<E> minimum(Position<E> pos) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public int size() {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Iterable<? extends Position<E>> rangeIterator(E m, E M) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Iterator<Position<E>> iterator() {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Position<E> root() {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Position<E> parent(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Iterable<? extends Position<E>> children(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public boolean isInternal(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public boolean isLeaf(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public boolean isRoot(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Position<E> left(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public Position<E> right(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public boolean hasLeft(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public boolean hasRight(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    /**
     * Create un new tree from node v.
     *
     * @param v new root node
     * @return  The new tree.
     */
    public LinkedBinarySearchTree<E> subTree(Position<E> v) {
        throw new RuntimeException("Not implemented yet.");
    }

    /**
     * Attach the tree lbt at the root of this tree 
     * @param lbt
    */  
    public void attach(LinkedBinarySearchTree<E> lbt) {
        throw new RuntimeException("Not implemented yet.");
    }
    
    
    /**
     * Attach tree t as left children of node p
     * @param p 
     * @param lbt 
    */ 
    
    public void attachLeft(Position<E> p, LinkedBinarySearchTree<E> lbt) {
        throw new RuntimeException("Not implemented yet.");
    }


    /**
     * Attach tree t as right children of node p
     * @param p
     * @param lbt 
    */ 
    
    public void attachRight(Position<E> p, LinkedBinarySearchTree<E> lbt) {
        throw new RuntimeException("Not implemented yet.");
    }
}
