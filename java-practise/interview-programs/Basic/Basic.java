public class Basic {
    /*
     * Time Complexity: O(LCM(a, b) - max(a, b) + 1), worst case O(a * b)
     * Space Complexity: O(1)
     */
    public int lcm(int firstNumber, int secondNumber) {
        int result = Math.max(firstNumber, secondNumber);

        while (true) {
            if (result % firstNumber == 0 && result % secondNumber == 0) {
                return result;
            }
            result++;
        }
    }
}
