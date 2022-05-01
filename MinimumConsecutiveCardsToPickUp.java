6048 - Minimum Consecutive Cards to pick up

public int minimumCardPickup(int[] cards) {
        boolean pairFound = false;
        int startIndex=0,endIndex=0, min = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<cards.length;i++) {
            if(!map.containsKey(cards[i])) {
                map.put(cards[i],i);
            }else {
                pairFound = true;
                startIndex=map.get(cards[i]);
                endIndex =i;
                if(min >(endIndex-startIndex+1)) {
                    min= endIndex-startIndex+1;
                }
                  map.put(cards[i],i);
            }
        }
        if(pairFound) 
        return min;
        else {
            return -1;
        }
    }
