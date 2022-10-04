public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(new char[]{'a','b','a'}));
    }

    static boolean isPalindrome(char[] input) {
        String str = new String(input);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
