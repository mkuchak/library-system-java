package br.com.acme.gui;

import javax.swing.JOptionPane;

public class GUIMessage {

    public static void info(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Info", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public static void error(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.OK_OPTION);
    }

    public static int action() {
        return JOptionPane.showConfirmDialog(null, "Are you sure you want proceed with this action?", "Action", JOptionPane.YES_NO_OPTION);
    }

    public static int exit() {
        return JOptionPane.showConfirmDialog(null, "Do you really want to leave?", "Exit", JOptionPane.YES_NO_OPTION);
    }

}
