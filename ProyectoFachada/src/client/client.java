package client;

import facade.facade;

public class client {
    public static void main(String[] args) {
        String filePath = "test.txt";  // Ruta del archivo
        String originalContent = "¡Hola, patrón Facade en Java!";  // Contenido original

        facade facade = new facade();

        // Escribir el contenido cifrado en el archivo
        facade.writeEncryptedFile(filePath, originalContent);

        // Leer el archivo y mostrar el contenido descifrado
        String decryptedContent = facade.readAndDecryptFile(filePath);
        System.out.println("Contenido descifrado: " + decryptedContent);
    }
}
