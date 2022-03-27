List<Integer> list = new ArrayList<Integer>();
        
        for(int num: nums) list.add(num);
        
        int count =0;
        
        for(int i=0;i<list.size()-1;i++) {
              if (i%2 != 0) continue;
            if(list.get(i).equals(list.get(i+1))) { // you must always use .equals to compare 2 list elements
                list.remove(i);
                i--; // // for handelling multiple same consecutive nos.
                count++;
            }
            
        }
        
        if(list.size()%2!=0) count++; //// if size remained is odd
     
        return count;
