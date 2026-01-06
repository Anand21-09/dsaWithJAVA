
public class charConverstion {

    public static void main(String[] args) {
        char character = (char) characterConvertLOWER('A');
        System.out.println("lower : " + character);
        char character1 = (char) characterConvertUPPER('a');
        System.out.println("upper : " + character1);
    }

    public static int characterConvertLOWER(char value) {
        return (value | 1 << 5);
    }

    public static int characterConvertUPPER(char value) {
        return (value & ~(1 << 5));
    }
}
