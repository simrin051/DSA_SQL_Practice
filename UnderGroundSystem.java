class Customer {
    int id;
    String stationName;
    int t;
    
    public Customer(int id,String stationName, int t) {
        this.id = id;
        this.stationName = stationName;
        this.t = t;
    }
}

public class Average {
    int sum;
    int n;
    
    Average() {}
    
    public Average(int sum, int n) {
        this.sum = sum;
        this.n= n;
    }
}

class UndergroundSystem {

    HashMap<Integer,Customer> map;
    HashMap<String,Average> avgList;
    public UndergroundSystem() {
        map = new HashMap<Integer,Customer>();
        avgList = new HashMap<String,Average>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map.put(id,new Customer(id,stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Customer customer = map.get(id);
        String station = customer.stationName+"-"+stationName;
        Average avgObj = avgList.getOrDefault(station,new Average());
        avgObj.sum = avgObj.sum + t-customer.t;
        avgObj.n = avgObj.n +1; 
        avgList.put(station,avgObj);
    }
    
    public double getAverageTime(String startStation, String endStation)    {
        Average avg = avgList.get(startStation+"-"+endStation);     
        return (double)avg.sum/(double)avg.n;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
