Brute force approach

	 public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++) {
            boolean[] visited = new boolean[256];
            for(int j=i;j<s.length();j++) {
               if(visited[s.charAt(j)]) break;
                else {
                    visited[s.charAt(j)]=true;
                }
             max = Math.max(max,j-i+1);
            }
        }
        return max;
    }




Using sliding window technique

	public int lengthOfLongestSubstring(String s) {
        String test="";
        int max=0;
        
        for(char c: s.toCharArray()) {
            if(test.contains(c+"")) {
                test = test.substring(test.indexOf(c)+1);
            }
            test=test+c;
            max = Math.max(max,test.length());
        }
        return max;
    }
