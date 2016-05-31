package mainApp;


/***************
@author Ava Shaw
***************/

public class Buffer {
	
	//TO CHANGE BUFFER SIZE EDIT INT[] ELEMENTS; CAPACITY, AND BOOLEAN[] ISOCCUPIED; AND AVAILABLE//
	   public static int[] elements = {0,0,0,0,0,0};

	    public static int capacity  = 6;
	    public static int writePos  = 0;
	    public static int available = 6;
	    public static int FIFOPos = 0;
	    
	    public static boolean[] isOccupied = {false, false, false, false, false, false};
	    

	    public static int write(int[] newElements){
	    	
	    	//sets read position in array newElements
	    	int readPos = 0;
	    	//number to be returned as number of elements added to buffer
	    	int numElements = 0;
	    	
	    	//if there aren't any spaces available we can't insert anything
	    	if (Buffer.available == 0){
	    		return 0;
	    	}
	    	//iterate through element list
	    	for(int i=0; i<=capacity-1 && i<=newElements.length-1; i++ ){
	    		//check if there are any spots available
	    		if(Buffer.available==0){
	    			//if not return the number of elements
	    			return numElements;
	    		}
	    		//else check if the next space is empty
	    		if(isOccupied[Buffer.writePos]!=true){
	    			//since it's not write the new int into the empty buffer space
	    			elements[Buffer.writePos]=newElements[readPos];
	    			//mark the space occupied
	    			isOccupied[Buffer.writePos]=true;
	    			//advance the read position in incoming array
	    			readPos++;
	    			//decrement number of available spaces
	    			Buffer.available--;
	    			//add to number of elements added to buffer
	    			numElements++;
	    			
	    			//increment the write position of buffer in circular fashion
	    			//if the write position in the array is the size of the 
	    			//capacity less one return to 0
	    			if(Buffer.writePos==capacity-1){
	    				Buffer.writePos=0;
	    				
	    			}else{
	    				//otherwise just increment the write position until we hit the above condition
	    				Buffer.writePos++;
	    			}
	    			
	    			
	    		}
	    		
	    	}
	    	
	    	return numElements;
	    	
	    	
	    	
	    }
	    


		//returns a single buffered int in FIFO order and 
		//removes the element from the buffer
		public static int read(){
			
			int retValue;
			
			if(available ==6){
				System.out.print("Null");
				return 0;
			}else
				
			//return elements[Buffer.FIFOPos];
			
			//increment the FIFO position of buffer in circular fashion
			//if the FIFO position in the array is the size of the 
			//capacity less one return to 0
				
			if(Buffer.FIFOPos==capacity-1){
				
				//we were at the end of the buffer to we return to 0 postion
				Buffer.FIFOPos=0;
				//we set the value in the buffer to retValue
				retValue= elements[Buffer.capacity-1];
				//clear the buffer element value
				elements[Buffer.capacity-1]=0;
				//set the space to unoccupied again
				isOccupied[capacity-1]=false;
				//add to the number of available spaces again
				Buffer.available++;
				
				
				return retValue;
				
				
			}else{
				//otherwise just increment the write position until we hit the above condition
				retValue = elements[Buffer.FIFOPos];
				//clear the buffer element value
				elements[Buffer.FIFOPos]=0;
				//set the space to unoccupied again
				isOccupied[Buffer.FIFOPos]=false;
				//add to the number of available spaces again
				Buffer.available++;
				//Update FIFOPos				
				Buffer.FIFOPos++;
				
				
				return retValue;
				
				
				
				}
			
			}
			
			
		}
		
		
		
		
		
	

