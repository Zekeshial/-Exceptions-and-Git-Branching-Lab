import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DataFileWriter {

    private String fileName;
    private int fileColumnLength;

    /**
     * Constructor for the DataFileWriter
     * @param fileName Name of the file you wish to create
     * @param fileColumnLength how many Columns/rows you wish to have the data be
     */
    public DataFileWriter(String fileName, int fileColumnLength) {
        this.fileName = fileName;
        this.fileColumnLength = fileColumnLength;
    }

    /**
     * Default constructor will create a file name of default and 0 rows/columns.
     */
    public DataFileWriter(){
        this.fileName = "default";
        this.fileColumnLength = 0;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileColumnLength() {
        return fileColumnLength;
    }

    public void setFileColumnLength(int fileColumnLength) {
        this.fileColumnLength = fileColumnLength;
    }

    /**
     * Creates a String of 4 integers and 2 floats
     * @return a String of 4 integers and 2 floats
     */
    public String informationOnEachLine(){
        Random random = new Random();

        int int1 = random.nextInt(1000);
        int int2 = random.nextInt(1000);
        int int3 = random.nextInt(1000);
        int int4 = random.nextInt(1000);
        float float1 = random.nextFloat(1000.4f);
        float float2 = random.nextFloat(1000.4f);

        String res = int1 + " " + int2 + " " + int3 + " " + int4 + " " + float1 + " " + float2;

        return res;

    }

    /**
     * Creates the information for the file
     */
    public void fileCreator() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < fileColumnLength; i++) {
                writer.write(informationOnEachLine());
                writer.newLine();
            }
            System.out.println("File written Successfully");
        } catch (FileNotFoundException fNotFound) {
        System.out.println("The file you tried to open could not be opened." + fNotFound.getMessage());
        } catch (StackOverflowError e){
            System.err.println("A Stack Over flow error has occurred. Maybe try to not make the file Column Length so Long to fix the problem.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

