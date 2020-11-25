package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Frame extends JFrame {
    public static final int SCREEN_WIDTH =800;
    public static final int SCREEN_HEIGHT = 1000;
    UserInterface userInterface;
    public Frame(){
        Toolkit toolkit = this.getToolkit();
        Dimension dimension = toolkit.getScreenSize();
        this.setBounds((dimension.width-SCREEN_WIDTH)/2,(dimension.height-SCREEN_HEIGHT)/2,SCREEN_WIDTH,SCREEN_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        /****************************************************/
        userInterface = new UserInterface();
        this.add(UserInterface.panel);

    }
    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();

        Frame productFrame = new Frame();
        productFrame.setVisible(true);
    }
}

