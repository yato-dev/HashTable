import java.util.LinkedList;


class MyHashMap<K, V> {
    private final int numBuckets;
    LinkedList<MyMapNode<K, V>>[] bucketArray;

    public MyHashMap() {
        this.numBuckets = 10; 
        this.bucketArray = new LinkedList[numBuckets];
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % numBuckets;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> myLinkedList = bucketArray[index];
        if (myLinkedList == null) {
            return null;
        }
        for (MyMapNode<K, V> myMapNode : myLinkedList) {
            if (myMapNode.key.equals(key)) {
                return myMapNode.getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        int index = getBucketIndex(key);
        if (bucketArray[index] == null) {
            bucketArray[index] = new LinkedList<>();
        }
        LinkedList<MyMapNode<K, V>> myLinkedList = bucketArray[index];
        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        myLinkedList.add(newNode);
    }

    public void display() {
        for (LinkedList<MyMapNode<K, V>> myLinkedList : bucketArray) {
            if (myLinkedList != null) {
                for (MyMapNode<K, V> myMapNode : myLinkedList) {
                    System.out.print("Key: " + myMapNode.key + ", Value: " + myMapNode.value + " | ");
                }
            }
        }
        System.out.println();
    }

   
}
