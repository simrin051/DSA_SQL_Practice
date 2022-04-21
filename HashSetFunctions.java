class MyHashSet {

    HashSet<Integer> set;
    public MyHashSet() {
        set=new HashSet(); 
    }
    
    public void add(int key) {
        set.add(key);
    }
    
    public void remove(int key) {
        if(contains(key)) set.remove(key);   
    }
    
    public boolean contains(int key) {
        return set.contains(key)?  true: false;
    }
}
