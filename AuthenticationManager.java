import java.util.Map.Entry;
class AuthenticationManager {

    Map<String,Integer> map = new HashMap<String,Integer>();
    int timeToLive;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;    
    }
    
    public void generate(String tokenId, int currentTime) {
        clean(currentTime);
        map.put(tokenId,currentTime+timeToLive);
    }
    
    public void renew(String tokenId, int currentTime) {
        clean(currentTime);
        if(map.containsKey(tokenId)) {
            map.put(tokenId,timeToLive+currentTime);
        }
    }
    
    public void clean(int currentTime) {
        Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() <= currentTime)
                iterator.remove();
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        clean(currentTime);
        return map.size();
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */
