package com.company;

import javax.swing.*;

public class dialog_messages {

    public static void main(String[] args) {
        String first_name = JOptionPane.showInputDialog("First Name");
        JOptionPane.showMessageDialog(null, first_name);
        JOptionPane.showInputDialog("Family", "Enter Your Family Name");
    }

}
/////http://www.homeandlearn.co.uk/java/java_option_panes.html
