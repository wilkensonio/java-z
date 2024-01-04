package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        TestWriting.writesNames("files/files1.csv", new String[]{"Wilkenson", "Hilarion"});
    }

    class TestWriting {
        static void writesNames(String path, String[] names) {
            try (FileWriter writer = new FileWriter(path)) {
                for (String name : names)
                    writer.write(name + "\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
