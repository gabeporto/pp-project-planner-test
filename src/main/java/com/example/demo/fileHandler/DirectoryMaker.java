package com.example.demo.fileHandler;

import java.io.File;

public class DirectoryMaker {
    public void dMaker(String path){
        String nameOfTheFolder = "projectOne";
        new File("./Projects/"+nameOfTheFolder).mkdirs();
    }
}
