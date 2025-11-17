class Solution {
    public String clearDigits(String s) {
         StringBuilder stack = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // remove the closest letter to the left
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                // letter → push to stack
                stack.append(c);
            }
        }
        
        return stack.toString();
    }
}