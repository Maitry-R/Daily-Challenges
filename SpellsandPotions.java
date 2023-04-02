public class SpellsandPotions {
    // my intution but wrong i guess need to work on it
    /*
     * class Solution {
     * public int[] successfulPairs(int[] spells, int[] potions, long success) {
     * int result = 0;
     * for(int i=0;i<spells.length;i++){
     * for(int j=0;j<potions.length;j++){
     * if(i*j>success||i*j==success){
     * result+=result;
     * }
     * }
     * }
     * return
     * }
     * }
     */
    // used binary search
    // Formula for binary search
    // mid = l+(r-l)/2, if target>= mid , r=mid-1 esle l=mid+1
    // where l=left(first index) and r=right(last index fo array.length)
    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int n = spells.length;
            int m = potions.length;
            int[] pairs = new int[n];
            Arrays.sort(potions);
            for (int i = 0; i < n; i++) {
                int spell = spells[i];
                int left = 0;
                int right = m - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    long product = (long) spell * potions[mid];
                    if (product >= success) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                pairs[i] = m - left;
            }
            return pairs;
        }
    }
}
