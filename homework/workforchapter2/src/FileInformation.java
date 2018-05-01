import java.io.*;

public class FileInformation {
    public static void main(String[] args)throws IOException {
        File file = new File("test.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line=" ";
        int characterCount=0;
        int countWord=0;
        int lines = 0;
        while ((reader.readLine()) != null)
            line=reader.toString();
            lines++;
            if (!(line.equals(" "))){
                characterCount += line.length();
                String[] wordList = line.split("\\s+");

                countWord += wordList.length;

            }


        System.out.println("the char count is "+characterCount);
        System.out.println("the word count is "+countWord);
        System.out.println("the line count is "+lines);
    }
}
