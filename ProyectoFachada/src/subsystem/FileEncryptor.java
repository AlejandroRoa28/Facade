package subsystem;
public class FileEncryptor {
    public String encrypt(String content) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            encrypted.append((char)(c + 1));
        }
        return encrypted.toString();
    }

    public String decrypt(String content) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            decrypted.append((char)(c - 1));
        }
        return decrypted.toString();
    }
}
