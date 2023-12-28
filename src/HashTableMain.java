public class HashTableMain {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer frequency = myHashMap.get(word);
            if (frequency == null) {
                myHashMap.add(word, 1);
            } else {
                myHashMap.add(word, frequency + 1);
            }
        }

        myHashMap.display();
    }
}
