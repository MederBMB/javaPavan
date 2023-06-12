package javaInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //1) using FileReader BufferReader
        /*FileReader fr = new FileReader("C:\\dlyaIntellej\\Text.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;

        while ((str = br.readLine()) != null){
            System.out.println(str);

        }
        br.close();*/

        //2) using Scanner & File
        /*File file = new File("C:\\dlyaIntellej\\Text.txt");
        Scanner scan = new Scanner(file);

        //loop statement
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }*/

        //3)using .useDelimiter method
        File file = new File("C:\\dlyaIntellej\\Text.txt");
        Scanner scan = new Scanner(file);

        scan.useDelimiter("\\Z");
        System.out.println(scan.next());



    }
}
