class Solution {
    public int minLength(String s) {
        StringBuilder st = new StringBuilder();

        for (char c : s.toCharArray()) {
            st.append(c);

            int n = st.length();

            if (n >= 2) {
                char a = st.charAt(n - 2);
                char b = st.charAt(n - 1);

                if ((a == 'A' && b == 'B') || (a == 'C' && b == 'D')) {
                    st.delete(n - 2, n); // remove both characters
                }
            }
        }

        return st.length();
    }
}