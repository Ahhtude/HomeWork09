import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataStructure {


    private final static int SIZE = 15;

    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {

        //заполнение массива числами от 0 до 15

        for (int i = 0; i < SIZE; i++) {

            arrayOfInts[i] = i;

        }

    }

    public EvenIterator returnEvenIterator(){
        return new EvenIterator();
    }


    private class EvenIterator implements DataStructureIterator {

        private DataStructure data = new DataStructure();
        private Integer index =0;

        @Override
        public boolean hasNext() {
            return this.data.arrayOfInts.length>=index;
        }

        @Override
        public Integer next() throws NoSuchElementException {
            return this.data.arrayOfInts[index++];
        }
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {


    }
}

