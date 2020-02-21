package app.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import app.grafo.No;

public class App {
    public static void main(String[] args) {
        System.out.println("Teste do Design Pattern State".toUpperCase());
        System.out.println("Exemplo de Busca em Profundidade em um Grafo");
        System.out.println("");

        // Cria 8 nos para o Grafo Teste
        No a = new No("A");
        No c = new No("C");
        No e = new No("E");
        No g = new No("G");
        No b = new No("B");
        No d = new No("D");
        No f = new No("F");
        No h = new No("H");

        // Adiciona os nos adjacentes de cada no do Grafo 
        a.addAdjacentes(b);
        c.addAdjacentes(d);
        a.addAdjacentes(e);
        f.addAdjacentes(c);
        f.addAdjacentes(h);
        b.addAdjacentes(c);
        d.addAdjacentes(b);
        e.addAdjacentes(f);
        f.addAdjacentes(g);
        a.addAdjacentes(h);

        // Mostra uma Hash dos nos adjacentes
        Map<String, Set<No>> meuGrafo = new HashMap<String, Set<No>>();

        meuGrafo.put(a.toString(), a.getAdjacentes());
        meuGrafo.put(b.toString(), b.getAdjacentes());
        meuGrafo.put(c.toString(), c.getAdjacentes());
        meuGrafo.put(d.toString(), d.getAdjacentes());
        meuGrafo.put(e.toString(), e.getAdjacentes());
        meuGrafo.put(f.toString(), f.getAdjacentes());
        meuGrafo.put(h.toString(), h.getAdjacentes());

        // Mostra os nos do grafo
        Set<String> nodesKeySet = meuGrafo.keySet();
        System.out.println("Nos do grafo: " + nodesKeySet);
        System.out.println("");

        System.out.println("Nos adjacentes");
        //para cada no da hash mostra seus nos adjacentes
		for (Set<No> elemento : meuGrafo.values()) {
            System.out.println(elemento);
        }

        System.out.println("");
        //Cria a lista de nos que representa o grafo de testes
        List<No> l = new ArrayList<>();

        //Faz a busca em profundidade a partir do no a da lista l 
        System.out.println("Busca em profundidade a partir do Nó A:");
        a.buscaProfundidade(l);

        //Imprime todos os nos da lista l (Grafo teste)
        for (No n : l)
            System.out.println(n);
    }
}