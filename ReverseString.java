public class ReverseString {

    public static void main(String[] args) {
        String str = "Chaitanya";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalStateException("Please enter valid string");
        }

        StringBuilder results = new StringBuilder();
        char[] chara = str.toCharArray();
        System.out.println(chara.length);
        for(int i = chara.length-1; i >= 0; i--) {
            results.append(chara[i]);
        }
        return results.toString();
    }
}
