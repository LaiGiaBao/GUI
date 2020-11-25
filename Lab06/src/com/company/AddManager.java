package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddManager implements ActionListener {
    Manager manager = new Manager();
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean isContain = false;
        int amountAdd = Integer.parseInt(UserInterface.textFieldAmount.getText());
        String name = UserInterface.textFieldProduct.getText();
        String description = UserInterface.textAreaDescription.getText();
        if (Manager.listOfProduction.size()==0){ Manager.listOfProduction.add(new Product(name,amountAdd,description)); }
        else {
            for (int i = 0; i < Manager.listOfProduction.size(); i++) {
                if (name.equals(Manager.listOfProduction.get(i).nameProduct) ) {
                    int amount = Manager.listOfProduction.get(i).amount+ amountAdd;
                    Manager.listOfProduction.get(i).setAmount(amount);
                    isContain = true;
                    break;
                }
            }

            if (!isContain) {
                Manager.listOfProduction.add(new Product(name, amountAdd,description));
            }
        }
        UserInterface.textAreaList.setText(manager.toString());
        manager.openFile();
        manager.addRecords();
        manager.closeFile();
        System.out.println("Added");
        //System.out.println(manager.toString());
    }
}
