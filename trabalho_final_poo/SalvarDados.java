
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class SalvarDados {

    public static void salvarLista(String nomeArquivo, List<? extends Serializable> lista) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            out.writeObject(lista);
            System.out.println("Dados salvos em: " + nomeArquivo);
        } catch (Exception e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }
}
