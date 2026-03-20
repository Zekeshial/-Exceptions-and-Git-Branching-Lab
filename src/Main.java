public class Main {

    static void main(String[] args) {

        String fileName = "TestFile";
        DataFileWriter writer = new DataFileWriter(fileName, 5);
        DataFileReader reader = new DataFileReader(fileName);

        writer.fileCreator();
        reader.dataReader();


    }
}
