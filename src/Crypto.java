import java.io.*;

class Crypto {

    static void Encrypt(File input, File key, File output) throws IOException {
        if(input.length() > key.length()) {
            throw new IOException("Input file is shorter than key file.");
        }
        BufferedReader inputIn = new BufferedReader(new FileReader(input));
        BufferedReader keyIn = new BufferedReader(new FileReader(key));

        int KeyASCII, InputASCII;

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(output));

        while((InputASCII = inputIn.read()) != -1 && (KeyASCII = keyIn.read()) != -1) {
            outputStream.write(InputASCII ^ KeyASCII);
        }
    }

    static void Decrypt(File input, File key, File output) throws IOException {
        if(input.length() > key.length()) {
            throw new IOException("Input file is shorter than key file.");
        }
        DataInputStream encryptedIn = new DataInputStream(new FileInputStream(input));
        BufferedReader keyIn = new BufferedReader(new FileReader(key));

        int KeyASCII, InputASCII;

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(output));

        while((InputASCII = encryptedIn.read()) != -1 && (KeyASCII = keyIn.read()) != -1) {
            outputStream.write(InputASCII ^ KeyASCII);
        }
    }
}