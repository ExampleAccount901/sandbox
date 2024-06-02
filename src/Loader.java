import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Collection;

public class Loader {
    public static void main(String[] args) {
        File root = new File("E:\\IdeaProjects\\sandbox_2");
        Collection<File> files = FileUtils.listFiles(root, null, true);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}