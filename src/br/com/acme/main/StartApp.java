package br.com.acme.main;

import br.com.acme.gui.LoginForm;
import javax.swing.UIManager;

public class StartApp {

    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            //ignored
        }
        LoginForm form = new LoginForm();
        form.setVisible(true);
    }

}
