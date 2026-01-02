import java.util.Arrays;

class MathUtils {


    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }


    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

class StringUtils {


    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

   
    static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    static String removeDuplicates(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(String.valueOf(s.charAt(i)))) {
                result += s.charAt(i);
            }
        }
        return result;
    }
}

class ArrayUtils {

    static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    static boolean search(int[] arr, int key) {
        for (int num : arr) {
            if (num == key)
                return true;
        }
        return false;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

 
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

 
    static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

public class MiniProject1 {
    public static void main(String[] args) {

     
        System.out.println("Math Utilities:");
        System.out.println("Power(2,3): " + MathUtils.power(2, 3));
        System.out.println("Factorial(5): " + MathUtils.factorial(5));
        System.out.println("Is 7 Prime? " + MathUtils.isPrime(7));
        System.out.println("GCD(12, 18): " + MathUtils.gcd(12, 18));
    
        System.out.println("\nString Utilities:");
        String str = "programming";
        System.out.println("Reverse: " + StringUtils.reverse(str));
        System.out.println("Is 'madam' Palindrome? " + StringUtils.isPalindrome("madam"));
        System.out.println("Vowel Count: " + StringUtils.countVowels(str));
        System.out.println("Remove Duplicates: " + StringUtils.removeDuplicates(str));

       
        System.out.println("\nArray Utilities:");
        int[] arr = { 5, 2, 9, 1, 7 };

        System.out.println("Original Array: " + Arrays.toString(arr));
        ArrayUtils.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Search 9: " + ArrayUtils.search(arr, 9));
        System.out.println("Max: " + ArrayUtils.findMax(arr));
        System.out.println("Min: " + ArrayUtils.findMin(arr));

        ArrayUtils.reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}