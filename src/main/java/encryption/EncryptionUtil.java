package encryption;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Objects;

public class EncryptionUtil {
    EncryptionUtil encryptionUtil;

    EncryptionUtil getInstance() {
        synchronized (this) {
            return Objects.requireNonNullElseGet(encryptionUtil, EncryptionUtil::new);
        }
    }

    private EncryptionUtil() {
    }

    public static String encrypt(String algorithm, String input, SecretKey key, IvParameterSpec iv)
            throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidAlgorithmParameterException, InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
//            First applying cipher and then Encoding using Base64 Encryption
        byte[] cipheredBytes = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(cipheredBytes);
    }

    public static String decrypt(String algorithm, String input, SecretKey key, IvParameterSpec iv)
            throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidAlgorithmParameterException, InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
//          Opposite of encrypt logic. First decoding from Base64 and then deciphering.
        byte[] decodedBytes = Base64.getDecoder().decode(input.getBytes());
        byte[] decipheredBytes = cipher.doFinal(decodedBytes);
        return new String(decipheredBytes);
    }

    /**
     * To Generate Initialization Vector (IV). It is a pseudo-random value
     * and has the same size as the block that is encrypted.
     **/
    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }


    public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        return keyGenerator.generateKey();
    }


}
