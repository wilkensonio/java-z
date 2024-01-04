package files;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


class TestReading {
    public static void main(String[] args) {
        ReadFromFile.readFile("files/file.txt");
    }

    static class ReadFromFile {
        static void readFile(String path) {
            try (FileReader fileReader = new FileReader(path)) {
                int data;
                while((data = fileReader.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getClass());
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getClass());
            }

        }
    }
}



