public class Save
people and boats
{
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
          
            
    
           int boatCount = 0;
            Arrays.sort(people);
            
            int left = 0;//lightest person
            int right = people.length - 1;//heaviest person
            
            while(left <= right){
                int sum = people[left] + people[right];//if both the leght and heavy can fit in one boat that is there wieght is equal or greater than the limit
                if(sum <= limit){
                    boatCount++;
                    left++;
                    right--;
                }
                else{
                    boatCount++;
                    right--;
                }
            }
            return boatCount;
        }
    }
}
