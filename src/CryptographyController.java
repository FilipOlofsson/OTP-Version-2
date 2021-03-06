import java.io.File;
import java.io.IOException;

class CryptographyController {

    void Perform(Arguments arg, String Input, String Key, String Output) {
        try {
            if(arg == Arguments.Decrypt) {
                Crypto.Decrypt(new File(Input), new File(Key), new File(Output));
            } else {
                Crypto.Encrypt(new File(Input), new File(Key), new File(Output));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

enum Arguments {
    Encrypt, Decrypt;
}