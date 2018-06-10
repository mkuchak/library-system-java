package br.com.acme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ALManager {

    // Cria a variável global da AcademicLibrary
    private static AcademicLibrary library;

    //Método estático que chama o método newLibrary
    static {
        newLibrary();
    }

    //captura o objeto AcademicLibrary que foi carregado ou criado
    public static AcademicLibrary getInstance() {
        return library;
    }

    //cria uma nova instância de AcademicLibrary
    public static void newLibrary() {
        library = new AcademicLibrary("New", "New Academic Library Control System");
    }

    //Méotodo chamado para tentar carregar um arquivo já existente no caminho especificado
    public static void loadLibrary(String directory) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(directory);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        library = (AcademicLibrary) obj;
        ois.close();
        fis.close();
    }

    //Méotodo chamado para salvar na memória a instância de AcademicLibrary
    public static void persistLibrary(String directory) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(directory);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(library);
        oos.flush();
        oos.close();
        fos.close();
    }

}
