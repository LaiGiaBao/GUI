package com.company;

import java.io.*;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Manager implements Serializable{
    private Scanner input;
    private Formatter output;
    static ArrayList<Product> listOfProduction=new ArrayList<Product>();
    private static final long serialVersionID = 1L;
    Manager(){
        openFile();
        readRecords();
    }
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < listOfProduction.size(); i++) {
            str += String.format("%d. Name:%s\t Amount:%s\t Description:%s\n", i+1, Manager.listOfProduction.get(i).nameProduct, Manager.listOfProduction.get(i).amount,Manager.listOfProduction.get(i).description);
        }
        return str;
    }
    public void openFile(){
        try{
            input = new Scanner(new File("Storage.txt"));
            output = new Formatter("Storage.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void readRecords(){
        try{
            int i=0;
            System.out.println(input.hasNext());
            while(input.hasNext()){
                System.out.println(input.next());
                listOfProduction.get(i).setNameProduct(input.next());
                listOfProduction.get(i).setAmount(input.nextInt());
                listOfProduction.get(i).setDescription(input.next());
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addRecords(){
        String str ="";
        for (Product product : listOfProduction) {
            str += String.format("%s %d %s\n", product.nameProduct, product.amount, product.description);
        }
        output.format(str);
    }
    public void closeFile(){
        if (output!= null)
            output.close();
    }
}
