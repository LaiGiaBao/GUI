package com.company;

public class Product {
    static int index =0;
    String nameProduct="";
    int amount;
    static String nameList ="";
    String description="This is default description";
    Product(String nameProduct, int amount,String description){
        index++;
        this.nameProduct = nameProduct;
        this.amount = amount;
        nameList +=nameProduct;
        this.description=description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
