// Refer - https://www.youtube.com/watch?v=4fzSIYZoixs

import java.util.Arrays;

class Solution {
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
    
    List<List<String>> result = new ArrayList<>();
    TreeMap<String,Integer> map = new TreeMap<>();
    String prefix="",firstWordWithPrefix="",lastWordWithPrefix="";
    int firstWordIndex=0,lastWordIndex=0;
    
    Arrays.sort(products);
    
    for(int i=0;i<products.length;i++) {
        map.put(products[i],i);
    }

    for(char c:searchWord.toCharArray()) {
        prefix+=c;
        firstWordWithPrefix = map.ceilingKey(prefix);
        lastWordWithPrefix = map.floorKey(prefix+"{"); // { has the ascii value immediately greater than all the alphabets
        
        if(firstWordWithPrefix==null || lastWordWithPrefix==null) {
            break;
        }
        
       firstWordIndex = map.get(firstWordWithPrefix);
       lastWordIndex =Math.min( firstWordIndex+3,  map.get(lastWordWithPrefix)+1);
        
                                            result.add(Arrays.asList(Arrays.copyOfRange(products,firstWordIndex,lastWordIndex)));

        
    }
    
    while(result.size() < searchWord.length()) {
        result.add(new ArrayList<>());
    }
    return result;
	}
}
