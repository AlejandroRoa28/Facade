package subsystem;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public String read(String filePath) {
        try {
            byte[] content = Files.readAllBytes(Paths.get(filePath));
            return new String(content);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
