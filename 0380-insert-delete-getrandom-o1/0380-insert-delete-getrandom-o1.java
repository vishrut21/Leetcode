class RandomizedSet {

    public HashSet<Integer> hashSet ;
    public Random random ;

    public RandomizedSet() {
        hashSet = new HashSet<>(); 
        random = new Random();
    }
    public boolean insert(int val) {
         return hashSet.add(val);
    }

    public boolean remove(int val) {
        return hashSet.remove(val);
    }
    
    public int getRandom() {
        Iterator<Integer> iterator = hashSet.iterator();
        int i = random.nextInt(hashSet.size());
        while (iterator.hasNext())
        {
            if (i == 0) return iterator.next();
            iterator.next();
            i--;
        }
        
        return 0;    
    }
    
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */