class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;//res is result of the no of subarrays possible
        long counter = 0;//if we find a zero then we increase the counter by 1
        //ele is any element of array nums strating from first index
        //if we find zero increase the counter and add it to the subarray using formula of Sum Sn = n(n+1)/2 which is sum of n natural numbers
      for(Integer ele:nums){
          if(ele==0){
              counter++;     
          }
          else{
                res += (counter*(counter+1))/2;
                counter = 0;
          }
      }
          //if counter is not zero that means the subarray consist of some zeros in it then add those using formula
              
                if(counter!=0){
            res += (counter*(counter+1))/2;
            counter = 0;
        }
      return res;
          }
      }    
          
 
/*class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long counter = 0;
        for(Integer ele:nums){
            if(ele==0){
                counter++;
            }else{
                res += (counter*(counter+1))/2;
                counter = 0;
            }
        }
        if(counter!=0){
            res += (counter*(counter+1))/2;
            counter = 0;
        }
        return res;
    }
}*/