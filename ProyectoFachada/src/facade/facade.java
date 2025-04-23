package facade;

import subsystem.FileEncryptor;
import subsystem.FileReader;
import subsystem.FileWriter;

public class facade {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private FileEncryptor fileEncryptor;

    public facade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.fileEncryptor = new FileEncryptor();
    }

    // Método para escribir el archivo con el contenido cifrado
    public void writeEncryptedFile(String filePath, String content) {
        String encryptedContent = fileEncryptor.encrypt(content);  // Cifrar el contenido
        System.out.println("Contenido cifrado: " + encryptedContent);  // Ver el contenido cifrado
        fileWriter.write(filePath, encryptedContent);  // Escribir el contenido cifrado
    }

    // Método para leer el archivo y descifrar el contenido
    public String readAndDecryptFile(String filePath) {
        String content = fileReader.read(filePath);  // Leer el archivo
        System.out.println("Contenido leído (antes de descifrar): " + content);  // Ver lo que se lee
        return fileEncryptor.decrypt(content);  // Descifrar el contenido
    }
}
