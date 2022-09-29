import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        System.out.println("teste");

        Hashtable<String, ArrayList<String>> tabela = new Hashtable<String, ArrayList<String>>();

        ArrayList<String> felipe = new ArrayList<String>();

        felipe.add("Bob");
        felipe.add("Claire");
        felipe.add("Alice");

        ArrayList<String> bob = new ArrayList<String>();

        bob.add("Anuj");
        bob.add("Peggy");

        ArrayList<String> claire = new ArrayList<String>();

        claire.add("Thom");
        claire.add("Jonny");

        ArrayList<String> alice = new ArrayList<String>();

        alice.add("Peggy");

        tabela.put("Felipe", felipe);
        tabela.put("Bob", bob);
        tabela.put("Claire", claire);
        tabela.put("Alice", alice);

        for (Map.Entry<String, ArrayList<String>> entry : tabela.entrySet()){
            String chave = entry.getKey();
            ArrayList<String> contatos = entry.getValue();

            System.out.println("Pessoa: " + chave + " - Contatos: " + contatos);
        }
    }
}
