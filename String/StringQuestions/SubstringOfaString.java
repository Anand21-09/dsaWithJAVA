
public class SubstringOfaString {

    public static void main(String[] args) {

        String abc = "abc";
        for (int i = 0; i < abc.length(); i++) {
            for (int j = i + 1; j <= abc.length(); j++) {
                System.out.println(abc.substring(i, j));
            }
        }
    }
}
