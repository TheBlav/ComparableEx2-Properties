package File;

import Data.Property;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class FileLoader {
    private final String fileName = "/Users/mdziuba/IdeaProjects/ComparableEx2/src/PropertyList.txt";
    int lines = 0;
    final static int INITIALTABSIZE = 2;
    String[] fileData = new String[INITIALTABSIZE];

    String nextLine = null;
    public String[] FileLoader() throws IOException{

                var fileReader = new FileReader(fileName);
                var bufferedReaded = new BufferedReader(fileReader);


            int Lines = 0;
            while ((nextLine = bufferedReaded.readLine()) != null){
               lines++;
            }
            bufferedReaded.close();
            fileReader.close();

        var fileReader2 = new FileReader(fileName);
        var bufferedReaded2 = new BufferedReader(fileReader2);
            int currentLine = 0;
                nextLine = null;
            while ((nextLine = bufferedReaded2.readLine()) != null) {
                if (currentLine > 0) {
                    if (fileData.length == currentLine) {
                        fileData = Arrays.copyOf(fileData, fileData.length + 2);
                    }
                    fileData[currentLine - 1] = nextLine;
                }
                currentLine++;
            }
            bufferedReaded2.close();
            fileReader2.close();







        return fileData;


    }


}
