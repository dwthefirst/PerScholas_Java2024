package GL_303_13_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {
    public static void main(String[] args) throws IOException {
        // initializing two files in Array;
        String[] inputFiles = {"C:\\Users\\ASU\\OneDrive - Arizona State University\\PerScholas - Java Developer\\Assignments_For_Submission\\Module 303\\GuidedLabs_303.5_andUp\\src\\GL_303_13_2\\files\\file1.txt",
            "C:\\Users\\ASU\\OneDrive - Arizona State University\\PerScholas - Java Developer\\Assignments_For_Submission\\Module 303\\GuidedLabs_303.5_andUp\\src\\GL_303_13_2\\files\\file1.txt"};

        String outputFile = "C:\\Users\\ASU\\OneDrive - Arizona State University\\PerScholas - Java Developer\\Assignments_For_Submission\\Module 303\\GuidedLabs_303.5_andUp\\src\\GL_303_13_2\\files\\nioOutputEXAMPLE2.txt";

        FileOutputStream fos = new FileOutputStream(outputFile); //oputput stream for writing data
        WritableByteChannel targetChannel = fos.getChannel(); //A channel that can read bytes
        for(int i = 0; i < inputFiles.length; i++) {
            //Get Channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]); //reading streams of raw bytes
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            inputChannel.close();
            fis.close();
        }
        targetChannel.close();
        fos.close();
    }
}
