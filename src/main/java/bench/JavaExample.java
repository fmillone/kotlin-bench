package bench;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class JavaExample {

    public Long processInputFile(String inputFilePath) {
        long count = 0;
        try {
            BufferedReader br = getBufferedReader(inputFilePath);
            boolean done = false;
            while (!done){
                String line = br.readLine();
                if (line == null) {
                    done = true;
                } else {
                    if(line.split(",")[5].equals("CRIMINAL DAMAGE")){
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    @NotNull
    private BufferedReader getBufferedReader(String inputFilePath) throws FileNotFoundException {
        File inputF = new File(inputFilePath);
        InputStream inputFS = new FileInputStream(inputF);
        return new BufferedReader(new InputStreamReader(inputFS));
    }


    public Long processInputFile2(String inputFilePath) {
        Long inputList = null;
        try (Stream<String> stream = Files.lines(Paths.get(inputFilePath))) {
            inputList = stream
                    .filter((s -> s.split(",")[5].equals("CRIMINAL DAMAGE")))
                    .count();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputList;
    }
}
