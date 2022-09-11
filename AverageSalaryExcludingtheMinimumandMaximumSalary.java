class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
    var find = Arrays.stream(salary).filter(x -> x != salary[0] &&  x != salary[salary.length-1] ).toArray();
      
double sum = IntStream. of(find).sum();
        return sum/find.length;
    }
}
