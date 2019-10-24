package GATIS;

public class MyMath {


	final static int decimalArraySize = 10;
	
	static int binaryToDecimal(int[] n) 
    { 
		int[] num = n; 
	    int dec_value = 0; 
	  
	    // Initializing base value to 1, i.e 2^0 
	    int base = 1; 
	  
	    int len = num.length; 
	    for (int i = len - 1; i >= 0; i--) { 
	        if (num[i] == 1) 
	            dec_value += base; 
	        base = base * 2; 
	    } 
		System.out.print(dec_value);	  
	    return (dec_value/8); 
	} 
  
	
	static int[] decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[32]; 
        
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
            //System.out.print(binaryArray[j]);
        }
        return binaryArray;
    }
	
	public static void main(String[] args){ 
        int n = 17; 
        binaryToDecimal(decToBinary(100)); 
        	
        
    }
	
	
}
