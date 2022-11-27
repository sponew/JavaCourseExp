package exp11.test3;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Example9_8OperatorListener implements ItemListener {
    JComboBox choice;
    Example9_8ComputerListener workTogether;

    public void setJComboBox(JComboBox box) {
        choice = box;
    }

    public void setWorkTogether(Example9_8ComputerListener computer) {
        workTogether = computer;
    }

    public void itemStateChanged(ItemEvent e) {
        String fuhao = choice.getSelectedItem().toString();
        workTogether.setFuhao(fuhao);
    }
}
