
 public int[] topKFrequent(int[] nums, int k) {
       
        int[] result = new int[k];
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(Integer num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b)->map.get(a)-map.get(b));
        
        /** When a num is added to the priority queue it is sorted based on map.get(a)-map.get(b) ***/
        
        for(int num : map.keySet()) {
            heap.add(num);
            
            if(heap.size()>k)
                heap.poll();
        }
        
        
         Iterator value = heap.iterator();
  
        // Displaying the values after iterating through the queue
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        
        
        for(int i=k-1;i>=0;i--)
            result[i] = heap.poll();
    
    return result;
    }
