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

    /**
     * Constructor, initial fields here
     */
    public MyHashMap() {

    }

    /**
     * Places a mapping from key->value. If key already exists, overwrites the previous value
     */
    public void put(int key, int value) {
        
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
    */
    public int get(int key) {
        return 0;
    }

    /** 
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {

    }
}
