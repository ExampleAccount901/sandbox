import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
    private Path filePath;

    public FileUtils(Path path) {
        filePath = path;
    }

    /*
    TODO: count only letters
     */
    public long countLetters() throws IOException {
        String content = Files.readString(filePath);
        long count = 0;
        for (int index = 0; index < content.length(); index++) {
            if (content.charAt(index) == ',') {
                continue;
            }
            count++;
        }
        return count;
    }

    /*
    TODO: count lines
     */
    public long countLines() {

        return 0;
    }
}
