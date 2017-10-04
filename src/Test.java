public class Test {
    public static void main(String[] args) {
        CryptographyController Controller = new CryptographyController();
        Controller.Perform(Arguments.Encrypt, "/home/filip/Documents/Java/One Time Pad/input.txt", "/home/filip/Documents/Java/One Time Pad/key.txt", "/home/filip/Documents/Java/One Time Pad/output.dat");
    }
}
