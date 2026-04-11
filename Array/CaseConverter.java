public class CaseConverter {

    public static void main(String[] args) {

        String input = "HeLLo123";

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Converted: " + result);
    }
}