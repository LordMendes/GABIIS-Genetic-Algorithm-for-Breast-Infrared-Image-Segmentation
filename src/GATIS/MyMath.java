package GATIS;

public class MyMath {


	final static int decimalArraySize = 10;
	
	static int binaryToDecimal(int[] n) 
    { 
		
		int[] num = new int[10];
		
		num = n; 
	    int dec_value = 0; 
	  
	    // Initializing base value to 1, i.e 2^0 
	    int base = 1; 
	  
	    int len = decimalArraySize; 
	    for (int i = len-1; i >= 0; i--) { 
	        if (num[i] == 1) 
	            dec_value += base; 
	        base = base * 2; 
	    } 
		//System.out.println(dec_value);	  
	    return (dec_value); 
	} 
  
	
	static int[] decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[decimalArraySize]; 
        
        // counter for binary array 
        int i = 0; 
        while (n > 0) { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        int[] binaryArray = new int[decimalArraySize];
        // printing binary array in reverse order 
        for (int j = 0; j < decimalArraySize; j++) {
        	if(binaryNum[decimalArraySize-j-1] == 1) {
        		binaryArray[j] =  binaryNum[decimalArraySize-j-1];
        	}else {
        		binaryArray[j] = 0;
        	}
        }
        return binaryArray;
    }
	
	public static void main(String[] args){ 
        int[] s = {0,0,0,1,1,0,0,1,0,0};
        System.out.print( MyMath.binaryToDecimal(s));
        for(int i = 0 ; i < decimalArraySize ; i++) {
        //	System.out.print(MyMath.decToBinary(100)[i]);
        }
        	
        
    }
	
	
}
