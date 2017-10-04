import java.io.File;
import java.io.IOException;

class CryptographyController {

    void Perform(Arguments args, String Input, String Key, String Output) {
        if(args == Arguments.Decrypt) {
            Decrypt(Input, Key, Output);
        } else {
            Encrypt(Input, Key, Output);
        }
    }

    private void Encrypt(String Input, String Key, String Output) {
        try {
            Crypto.Perform(new File(Input), new File(Key), new File(Output));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Decrypt(String Input, String Key, String Output) {
        try {
            Crypto.Perform(new File(Input), new File(Key), new File(Output));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

enum Arguments {
    Encrypt, Decrypt;
}