package subsystem;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public void write(String filePath, String content) {
        try {
            Files.write(Paths.get(filePath), content.getBytes());
            System.out.println("Escribiendo contenido en: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
