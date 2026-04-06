class Solution {

    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> numFrequencies = new HashMap<>();

        for (var n : nums) {
            
            numFrequencies.merge(n, 1, Integer::sum);

            if (numFrequencies.containsKey(n) && numFrequencies.get(n) > nums.length / 2) {
                return n;
            }
        }

        throw new IllegalStateException();
    }
}