class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int[] cnt = new int[26];
        int pairs = 0, res = 0;
        int[] sizes = new int[words.length];
        int i = 0;
        for (String w : words) {
            for (char ch : w.toCharArray())
                pairs += (++cnt[ch - 'a']) % 2 == 0 ? 1 : 0;
            sizes[i++] = w.length();
        }
        Arrays.sort(sizes);
        for (int sz : sizes) {
            pairs -= sz / 2;
            res += pairs >= 0 ? 1 : 0;
        }
        return res;
    }
}
