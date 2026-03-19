import static org.junit.jupiter.api.Assertions.*;

class DataFileWriterTest {

    @org.junit.jupiter.api.Test
    void informationOnEachLine() {
        DataFileWriter test1 = new DataFileWriter();
        System.out.println(test1.informationOnEachLine());


    }

    @org.junit.jupiter.api.Test
    void fileCreator() {
        DataFileWriter test1 = new DataFileWriter("test", 10);
        test1.fileCreator();
    }
}