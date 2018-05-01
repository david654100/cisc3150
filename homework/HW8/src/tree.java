
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import  java.io.*;

public class tree {
    public static void main(String[] args) throws IOException {

        //opens the file using the pth name
        File folder = new File("\\C:\\Users\\david\\Desktop");
        StringBuilder treePrintOut;
        //this calls the function that will make the fill tree
        treePrintOut=printTree(folder);
        System.out.print(treePrintOut.toString());
       FileWriter fw = new FileWriter("fileOutput.txt");
       BufferedWriter bw = new BufferedWriter(fw);
        bw.append(treePrintOut);







    }

    /**
     * this function is the driver for printing the tree
     * @param folder this is the folder that will be printed
     * @return the fully built file tree string
     */
    public static StringBuilder printTree(File folder){
        //tests to see if the original file is a directory if it is not it throws an error because there is no tree to print
        if(!folder.isDirectory()){
            throw new NotDirectoryError("there file is not a directory");
        }

        // the indent increases as the ry levels of the trees go up
        int indent =0;
        StringBuilder str = new StringBuilder();
        //this is where the tree actually gets built
        printDecTree(folder,indent,str);
        return str;
    }

    /**
     * this function builds the string
     * @param folder the folder to be built
     * @param indent the file level that is being built
     * @param str this is the stringbuilder that the tree is being buit on
     */
    private static void printDecTree(File folder,int indent, StringBuilder str) {
       if (!folder.isDirectory()) {
            throw new NotDirectoryError("there file is not a directory");
        }

        str.append(getIndentString(indent));
        str.append("+--");
        str.append(folder.getName());
        str.append("/");
        str.append("\n");
//this builds the tree if there are files
        for ( File file : folder.listFiles()) {
            if (file.isDirectory()) {
                printDecTree(file, indent + 1, str);
            } else {
                printFile(file, indent + 1, str);
            }

        }
    }

    /**
     *
     * @param file the file that is being built in the tree
     * @param indent this is the current indent
     * @param sb the sting builder that is being built to
     */
    private static void printFile(File file, int indent, StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("\n");
    }

    /**
     *
     * @param indent the current indent
     * @return returns the built indent to be appended to sb
     */
    private static String getIndentString(int indent) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            str.append("|  ");
        }
        return str.toString();
    }


}



class NotDirectoryError extends IllegalArgumentException{
    private String errorMessage = "NotInDirectoryError";

    public NotDirectoryError(){
        System.err.println(errorMessage);
    }

    public NotDirectoryError(String str){
        System.err.println(errorMessage+" "+str);
    }
}













/*
https://www.jetbrains.com/help/idea/nullable-and-notnull-annotations.html
https://www.journaldev.com/864/java-open-file
https://docs.oracle.com/javase/tutorial/java/data/buffers.html
https://stackoverflow.com/questions/12889275/java-and-windows-error-illegal-escape-character/12889283
 */

