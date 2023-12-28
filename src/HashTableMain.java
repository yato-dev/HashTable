public class HashTableMain {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
    
        String paragraph = "Paranoids are not paranoid because they are paranoid "
                + "but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split(" ");

        for (String word : words) {
            Integer frequency = myHashMap.get(word);
            if (frequency == null) {
                myHashMap.add(word, 1);
            } else {
                myHashMap.add(word, frequency + 1);
            }
        }

        myHashMap.display();


        

      
        myHashMap.bucketArray[myHashMap.getBucketIndex("avoidable")].clear();

        
        myHashMap.display();
    }
}




