package encryption;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtilTest {

    @Test
    void givenString_whenEncrypt_thenSuccess() throws NoSuchAlgorithmException,
            IllegalBlockSizeException, InvalidKeyException, BadPaddingException,
            InvalidAlgorithmParameterException, NoSuchPaddingException {
        String input = "Vamsi";
        SecretKey key = EncryptionUtil.generateKey(256);
        IvParameterSpec ivParameterSpec = EncryptionUtil.generateIv();
        String algorithm = "AES/CBC/PKCS5Padding";
        String cipherText = EncryptionUtil.encrypt(algorithm, input, key, ivParameterSpec);
        String decipheredText = EncryptionUtil.decrypt(algorithm, cipherText, key, ivParameterSpec);
        assertEquals(input, decipheredText);
    }
}