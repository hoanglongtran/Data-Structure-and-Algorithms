package Assignments.As2;

import java.util.ArrayList;

public class MaxHeap {
    public ArrayList<Integer> items = new ArrayList<>();
    private int size = 0;



    private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex +1;}
    private int getRightChildIndex(int parentIndex) {return 2 * parentIndex +2;}
    private int getParentIndex(int childIndex) {return (childIndex - 1) / 2;}

    private int leftChild(int index) { return items.get(getLeftChildIndex(index));}
    private int rightChild(int index) { return items.get(getRightChildIndex(index));}
    private int parent(int index) { return items.get(getParentIndex(index));}

    private boolean hasLeftChild(int index) {return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size;}
    private boolean hasParent(int index) { return getParentIndex(index) < size;}

    private void swap(int indexOne, int indexTwo){
        int temp = items.get(indexOne);
        items.set(indexOne, items.get(indexTwo));
        items.set(indexTwo, temp);
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items.get(0);
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items.get(0);
        items.set(0, items.get(size - 1));

        //items.insert(0, items.get(size - 1));
        size--;
        heapifyDown();
        return item;

    }

    public void insert(int item) {
        items.add(size,  item);
        //items.insert(size, item);
        size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) < items.get(index)){
            swap(getParentIndex(index), index);
           // Collections.swap(items, items[getParentIndex(index)], items[index)];
            index = getParentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)){
            int largerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }

            if (items.get(index) > items.get(largerChildIndex)){
                break;
            } else  {
                swap(index, largerChildIndex);
                //Collections.swap(items, items[index], items.get(largerChildIndex));
            }

            index = largerChildIndex;
        }

    }
}