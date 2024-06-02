import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Collection;

public class Loader {
    public static void main(String[] args) {
        File root = new File("E:\\IdeaProjects\\sandbox_2");
        Collection<File> files = FileUtils.listFiles(root, null, true);
        int count = 0;
        for (File file : files) {
            if (file.getName().endsWith(".java"))
                System.out.println(file.getAbsolutePath());
                count++;
        }

        System.out.printf("Count of java files: %d%n", count);

        if (count != 2) {
            System.err.println("Try again");
        }
    }
}