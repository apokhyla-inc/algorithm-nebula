class Solution {

    public int majorityElement(int[] nums) {

        var result = 0;
        var count = 0;

        for (var n : nums) {

            if (count == 0) {
                result = n;
            }

            count += n == result ? 1 : -1;
        }

        return result;
    }
}