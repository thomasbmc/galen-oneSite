package com.galenframework.java.sample.components;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.galenframework.java.sample.components.Html.Log;
/**
 * Created by tmphillips on 16-10-2015.
 */
public class TextLogWritter implements LogWritter {


    @Override
    public void WriteLog(List<Log> logs) throws IOException {
        File myFile = new File("log-file.txt");
        if(myFile.createNewFile()) {
            PrintWriter writer = new PrintWriter("log-file.txt", "UTF-8");
            for (Log log : logs) {
                System.out.println("Add line to file");
                writer.println("Test: " + log.getTitle() + " - Status: "+ log.getStatus() + " - Descryption: "+ log.getDescryption()
                + " - Test Date: "+ log.getDate());
            }
            writer.close();
        }
    }
}
