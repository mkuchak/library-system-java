package br.com.acme.main;

import br.com.acme.ALManager;
import br.com.acme.gui.LoginForm;
import java.io.File;
import javax.swing.UIManager;

public class StartApp {

    public static File path;
    public static String file;

    public static void main(String[] args) {
        path = new File(System.getProperty("user.home") + "\\Documents\\LibraryFiles\\");
        path.mkdirs();
        file = System.getProperty("user.home") + "\\Documents\\LibraryFiles\\library";
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            ALManager.loadLibrary(file);
        } catch (Exception ex) {
        }
        LoginForm form = new LoginForm();
        form.setVisible(true);
    }

}
