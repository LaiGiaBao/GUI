package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchManager implements ActionListener {
    Manager manager = new Manager();
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = UserInterface.textFieldProduct1.getText();
        int index =0;
        while (true){
            if(name.equals(Manager.listOfProduction.get(index).nameProduct)){
                String amount = String.valueOf(Manager.listOfProduction.get(index).amount);
                UserInterface.textFieldAmount1.setText(amount);
                UserInterface.textAreaDescription1.setText(Manager.listOfProduction.get(index).description);
                break;
            }
            index++;
            if(index >= Manager.listOfProduction.size()){
                UserInterface.textFieldAmount1.setText("0");
                UserInterface.textAreaDescription1.setText("This item is not in the list");
                break;
            }
        }
    }
}
