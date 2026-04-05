class Solution {

    public boolean judgeCircle(String moves) {
        
        var up = 0;
        var down = 0;
        var left = 0;
        var right = 0;

        for (var c : moves.toCharArray()) {
            switch (c) {
                case 'U' -> up++;
                case 'D' -> down++;
                case 'L' -> left++;
                case 'R' -> right++;
            }
        }

        return up == down && left == right;
    }
}