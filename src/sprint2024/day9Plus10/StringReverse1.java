package sprint2024.day9Plus10;

public class StringReverse1 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringReverse1.reverseUsingStringBuilder(str);
        StringReverse1.reverseUsingCharArray(str);
        StringReverse1.reverseUsingCharAt(str);
        StringReverse1.reverseUsingStringSplit(str);
    }

    public static void reverseUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("reverse of \"" + str + "\" is \"" + sb.reverse() + "\"");
    }

    public static void reverseUsingCharArray(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed = reversed + charArray[i];
        }
        System.out.println("reverse of \"" + str + "\" is \"" + reversed + "\"");
    }

    public static void reverseUsingCharAt(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("reverse of \"" + str + "\" is \"" + reversed + "\"");
    }

    public static void reverseUsingStringSplit(String str) {
        String reversed = "";
        String[] tokens = str.split("");
        for (int i = tokens.length - 1; i >= 0; i--) {
            reversed = reversed + tokens[i];
        }
        System.out.println("reverse of \"" + str + "\" is \"" + reversed + "\"");
    }

}
