package com.mycompany.imagetotext;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.lept;
import org.bytedeco.javacpp.lept.PIX;
import org.bytedeco.javacpp.tesseract.TessBaseAPI;



public class MainJava {
    
    public static void main(String[] args) {


        TessBaseAPI instance = new TessBaseAPI();
        instance.Init("/home/mehrdad/Downloads", "eng");
        //instance.Init("/home/mehrdad/Downloads", "fas");
        PIX image = lept.pixRead("/home/mehrdad/Pictures/33.png");
        instance.SetImage(image);
        BytePointer bytePointer = instance.GetUTF8Text();
        String output = bytePointer.getString();
        System.out.println( output);
    }
}
