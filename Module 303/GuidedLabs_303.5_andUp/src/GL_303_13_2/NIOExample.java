package GL_303_13_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOExample {
    public static void main(String[] args) throws IOException {
        // initializing two files in Array;
        String[] inputFiles = {"C:\\Users\\ASU\\OneDrive - Arizona State University\\PerScholas - Java Developer\\Assignments_For_Submission\\Module 303\\GuidedLabs_303.5_andUp\\src\\GL_303_13_2\\files\\file1.txt",
        "C:\\Users\\ASU\\OneDrive - Arizona State University\\PerScholas - Java Developer\\Assignments_For_Submission\\Module 303\\GuidedLabs_303.5_andUp\\src\\GL_303_13_2\\files\\file1.txt"};

        // Specify out file with path location
        //Files contents will be written in these files
        String outputFile = "C:\\Users\\ASU\\OneDrive - Arizona State University\\PerScholas - Java Developer\\Assignments_For_Submission\\Module 303\\GuidedLabs_303.5_andUp\\src\\GL_303_13_2\\files\\nioOutput.txt";

        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for(int i = 0; i < inputFiles.length; i++) {
            FileInputStream fis = new FileInputStream(inputFiles[i]); //opening connection to file
            FileChannel inputchannel = fis.getChannel(); //connected to file which can do stuff
            long size = inputchannel.size(); //get size of channel
            ByteBuffer buf = ByteBuffer.allocate((int) size); //making the size for the buffer
            System.out.println((char) buf.get()); //reads the byte (char)
            while(inputchannel.read(buf) > 0) { //if it reads something/if something is there
                buf.flip(); //resets the current posotion to 0.
                while(buf.hasRemaining()) { //if there is anything still to read
                    System.out.println((char) buf.get());
                    targetChannel.write(buf); //is writing it to the output file
                }

            }
            fis.close(); //close the input filestream
        }


    }
}
