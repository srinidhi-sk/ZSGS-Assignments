public class AddStrings{

    public static String addStrings(String s1, String s2) {
        String result = "";
        int carry = 0;

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int str1 = 0;
            int str2 = 0;
            if (i >= 0) {
                str1 = s1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                str2 = s2.charAt(j) - '0';
                j--;
            }

            int sum = str1 + str2 + carry;
            carry = sum / 10;
            int laststr = sum % 10;
            result = laststr + result;
        }

        return result;
    }

    public static void main(String[] args) {
        AddStrings a = new AddStrings();
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77")); 
        System.out.println(addStrings("0", "0"));     
    }
}
