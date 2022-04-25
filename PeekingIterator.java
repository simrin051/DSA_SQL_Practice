// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    static int top=0;
    List<Integer> list;
        Iterator<Integer> iter = null;
    Integer next = null;
    
    /** Use pointer top to point to elements in the list **/
    
	public PeekingIterator(Iterator<Integer> iterator) {
	// initialize any member here.
	    iter = iterator;
        if(hasNext()) next = iter.next();

	}
	
    /** Get the first element in the list **/
    
    public Integer peek() {
      return  next;
	}
	
    /** Get the first element from the list and remove it. Top will automatically point to next element of the list without incrementing top pointer **/
    
    @Override
	public Integer next() {
        int removedElement = next;
        if(iter.hasNext())
            next = iter.next();
        else {
            next = null;
        }
         return removedElement;        
    }
	
    /** If list.size()!=0 then there are elements **/
    
	@Override
	public boolean hasNext() {
	    return next!=null ||iter.hasNext();
	}
}
