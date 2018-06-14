package br.com.acme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class ALManager {

    /**
     * Creates the global variable AcademicLibrary which represents your
     * Library.
     *
     */
    private static AcademicLibrary library;

    /**
     * Static method to call a new library.
     *
     */
    static {
        newLibrary();
    }

    /**
     * Get library instanced which was charged or created.
     *
     */
    public static AcademicLibrary getInstance() {
        return library;
    }

    /**
     * Creates a new library instance.
     *
     */
    public static void newLibrary() {
        library = new AcademicLibrary("New", "New Academic Library Control System");
    }

    /**
     * Loads a existent library file from a path.
     *
     * @param path local path file
     */
    public static void loadLibrary(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        library = (AcademicLibrary) obj;
        ois.close();
        fis.close();
    }

    /**
     * Save a library information to a new file.
     *
     * @param path local path file
     */
    public static void persistLibrary(String path) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(library);
        oos.flush();
        oos.close();
        fos.close();
    }

}
