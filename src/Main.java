public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(new char[]{'a','b','a','b'}));
    }

    static boolean isPalindrome(char[] input) {
        int i = 0;
        int j = input.length - 1;
        while (i < j) {
            if (input[i] != input[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
