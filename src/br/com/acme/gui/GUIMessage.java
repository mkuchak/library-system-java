package br.com.acme.gui;

import javax.swing.JOptionPane;

public class GUIMessage {

    public static void info(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Info", JOptionPane.OK_OPTION);
    }

    public static int exit() {
        return JOptionPane.showConfirmDialog(null, "Do you really want to leave?", "Exit", JOptionPane.YES_NO_OPTION);
    }

}
