package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveManager implements ActionListener {
    Manager manager = new Manager();
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean isContain = true;
        String name = UserInterface.textFieldProduct.getText();
        for(int i=0;i < Manager.listOfProduction.size();i++){
            if(name.equals(Manager.listOfProduction.get(i).nameProduct)){
                int amount = Manager.listOfProduction.get(i).amount;
                amount --;
                Manager.listOfProduction.get(i).setAmount(amount);
            }
            if(Manager.listOfProduction.get(i).amount<=0){
                Manager.listOfProduction.remove(Manager.listOfProduction.get(i));
            }
        }
        UserInterface.textAreaList.setText(manager.toString());
        manager.openFile();
        manager.addRecords();
        manager.closeFile();
        System.out.println("Removed");
        //System.out.println(manager.toString());
    }
}
