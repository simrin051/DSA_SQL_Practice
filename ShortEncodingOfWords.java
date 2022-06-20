class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> s = new HashSet<String>(Arrays.asList(words));
        for(int i=0;i<words.length;i++) {
            for(int j=1;j<words[i].length();j++) {
                s.remove(words[i].substring(j));
            }
        }
        
        int ans = 0;
        for(String word: s) {
            ans = ans+word.length()+1;
        }
        return ans;
    }
}
