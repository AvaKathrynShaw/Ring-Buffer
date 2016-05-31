/***************
@author Ava Shaw
***************/

public class Main {
	

    public static int capacity  = 6;
    public static int writePos  = 0;
    public static int available = 0;
    
    //returns remaining number of open buffer spots
    public static int remainingCapacity() {
        return capacity - available;
    }
    
    public static void reset() {
        writePos = 0;
        available = 0;
    }
    
	
	//writes ints to buffer without overwriting data and
    //returns the number of elements written to the buffer
	public static int write(int[] data){
		if(data.length<=remainingCapacity())
		{	
			
			return data.length;
		}
		else return 0;
		
	}
	
	//returns a single buffered int in FIFO order and 
	//removes the element from the buffer
	public static int read(){
		return 0;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
			int test1[]={1,2,3};
			int test2[]={4,5,6,7,1,4,5,6,7,8};
			int test3[]={8,9};
		    System.out.println(write(test1));
		    System.out.println(write(test2));
		    System.out.println(write(test3));
			
		    System.out.println(read());
		    System.out.println(read());
		    System.out.println(read());
		    System.out.println(read());
		    System.out.println(read());
		    System.out.println(read());
		    System.out.println(read());
		    System.out.println(read());
		    System.out.println(read());
		    
			
		   }

}
