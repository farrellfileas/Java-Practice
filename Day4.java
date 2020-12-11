import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);          
        hashMap.put(2, 2);         
        System.out.println(hashMap.get(1));            // returns 1
        System.out.println(hashMap.get(3));            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        System.out.println(hashMap.get(2));            // returns 1 
        hashMap.remove(2);          // remove the mapping for 2
        System.out.println(hashMap.get(2));            // returns -1 (not found) 
    }
}

class MyHashMap {
    // Declare fields as needed here
    ArrayList<LinkedList<int[]>> buckets;
    int size;

    /**
     * Constructor, initial fields here
     */
    public MyHashMap() {
        buckets = new ArrayList<>();
        for (int i = 0; i < 37; i++) {
            buckets.add(new LinkedList<>());
        }
        size = 0;
    }

    /**
     * Places a mapping from key->value. If key already exists, overwrites the previous value
     */
    public void put(int key, int value) {
        int moddedKey = key % buckets.size();
        for (int i = 0; i < buckets.get(moddedKey).size(); i++) {
            if (buckets.get(moddedKey).get(i)[0] == key) {
                buckets.get(moddedKey).get(i)[1] = value;
                return;
            }
        }
        buckets.get(moddedKey).add(new int[]{key, value});
        size++;

        double loadValue = ((double)size) / buckets.size();
        if (loadValue >= 0.75) {
            resize();
        }
    }

    private void resize() {
        ArrayList<LinkedList<int[]>> newBuckets = new ArrayList<>();
        for (int i = 0; i < buckets.size() * 2; i++) {
            newBuckets.add(new LinkedList<>());
        }
        for (int i = 0; i < buckets.size(); i++) {
            for(int j = 0; j < buckets.get(i).size(); j++) {
                int key = buckets.get(i).get(j)[0];
                int value = buckets.get(i).get(j)[1];
                int moddedKey = key % newBuckets.size();
                boolean changed = false;
                for (int k = 0; k < buckets.get(moddedKey).size(); k++) {
                    if (newBuckets.get(moddedKey).get(k)[0] == key) {
                        newBuckets.get(moddedKey).get(k)[1] = value;
                        changed = true;
                    }
                }
                if (!changed) {
                    newBuckets.get(moddedKey).add(new int[]{key, value});
                }
            }
        }
        buckets = newBuckets;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
    */
    public int get(int key) {
        int moddedKey = key % buckets.size();
        for (int i = 0; i < buckets.get(moddedKey).size(); i++) {
            if (buckets.get(moddedKey).get(i)[0] == key) {
                return buckets.get(moddedKey).get(i)[1];
            }
        }
        return -1;
    }

    /** 
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int moddedKey = key % buckets.size();
        for (int i = 0; i < buckets.get(moddedKey).size(); i++) {
            if (buckets.get(moddedKey).get(i)[0] == key) {
                buckets.get(moddedKey).remove(i);
            }
        }
    }
}
