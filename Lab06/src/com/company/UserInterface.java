package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UserInterface extends JLabel {
    static JPanel panel;
    static JLabel labelProduct;
    static JTextField textFieldProduct;
    static JLabel labelAmount;
    static JTextField textFieldAmount;
    static JLabel labelDescription;
    static JTextArea textAreaDescription;
    static JLabel labelList;
    static JTextArea textAreaList;
    static JButton buttonAdd;
    static JButton buttonRemove;
    static JButton buttonSearch;
    static JLabel labelProductSearch;
    static JLabel labelProduct1;
    static JTextField textFieldProduct1;
    static JLabel labelAmount1;
    static JTextField textFieldAmount1;
    static JLabel labelDescription1;
    static JTextArea textAreaDescription1;
    Manager manager;
    UserInterface() {
        manager = new Manager();
        panel = new JPanel();
        panel.setLayout(null);

        labelProduct = new JLabel("Product");
        labelProduct.setBounds(10, 20, 80, 25);
        panel.add(labelProduct);

        textFieldProduct = new JTextField(20);
        textFieldProduct.setBounds(75, 20, 150, 25);
        panel.add(textFieldProduct);

        labelAmount = new JLabel("Amount");
        labelAmount.setBounds(10, 50, 80, 25);
        panel.add(labelAmount);

        textFieldAmount = new JTextField(20);
        textFieldAmount.setBounds(75, 50, 150, 25);
        panel.add(textFieldAmount);

        labelDescription = new JLabel("Description");
        labelDescription.setBounds(10, 80, 80, 25);
        panel.add(labelDescription);

        textAreaDescription = new JTextArea();
        textAreaDescription.setBounds(75, 80, 150, 80);
        panel.add(textAreaDescription);

        labelList = new JLabel("Product List");
        labelList.setFont(new Font("Arial", Font.PLAIN, 30));
        labelList.setBounds(500, 10, 200, 50);
        panel.add(labelList);

        textAreaList = new JTextArea();
        textAreaList.setBackground(Color.WHITE);
        textAreaList.setBounds(425, 70, 400, 800);
        textAreaList.setEditable(false);
        textAreaList.setLayout(null);
        textAreaList.setFont(new Font("Arial",Font.PLAIN,16));
        textAreaList.setText(manager.toString());
        panel.add(textAreaList);


        buttonAdd = new JButton("Add");
        buttonAdd.setBounds(60, 200, 80, 40);
        buttonAdd.addActionListener(new AddManager());
        panel.add(buttonAdd);

        buttonRemove = new JButton("Remove");
        buttonRemove.setBounds(150, 200, 80, 40);
        buttonRemove.addActionListener(new RemoveManager());
        panel.add(buttonRemove);

        buttonSearch = new JButton("Search");
        buttonSearch.setBounds(120,800,80,40);
        buttonSearch.addActionListener(new SearchManager());
        panel.add(buttonSearch);

        labelProductSearch = new JLabel("Product Search");
        labelProductSearch.setBounds(60, 500, 500, 80);
        labelProductSearch.setFont(new Font("Arial",Font.PLAIN,40));
        panel.add(labelProductSearch);

        labelProduct1 = new JLabel("Product");
        labelProduct1.setBounds(60,580,80,25);
        panel.add(labelProduct1);

        textFieldProduct1 = new JTextField(20);
        textFieldProduct1.setBounds(130,580,160,25);
        panel.add(textFieldProduct1);

        labelAmount1 = new JLabel("Amount");
        labelAmount1.setBounds(60,610,80,25);
        panel.add(labelAmount1);

        textFieldAmount1 = new JTextField(20);
        textFieldAmount1.setBounds(130,610,160,25);
        textFieldAmount1.setEditable(false);
        panel.add(textFieldAmount1);

        labelDescription1 = new JLabel("Description");
        labelDescription1.setBounds(60,640,80,25);
        panel.add(labelDescription1);

        textAreaDescription1 = new JTextArea();
        textAreaDescription1.setBounds(130,640,200,120);
        textAreaDescription1.setEditable(false);
        panel.add(textAreaDescription1);
    }

}

