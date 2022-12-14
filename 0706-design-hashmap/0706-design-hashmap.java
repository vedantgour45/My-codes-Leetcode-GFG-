class MyHashMap {
    int[] freq;
    public MyHashMap() {
        freq = new int[1000001];
        Arrays.fill(freq, -1);
    }
    
    public void put(int key, int value) {
        freq[key] = value;
    }
    
    public int get(int key) {
        return freq[key];
    }
    
    public void remove(int key) {
        freq[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */