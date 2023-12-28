import java.util.LinkedList;

class MyMapNode<K, V> {
    K key;
    V value;
    LinkedList<MyMapNode<K, V>> myLinkedList;

    public MyMapNode() {
        this.myLinkedList = new LinkedList<>();
    }

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.myLinkedList = new LinkedList<>();
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}