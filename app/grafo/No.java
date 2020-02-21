package app.grafo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import app.grafo.cor.Branco;
import app.grafo.cor.Cor;

public class No {
    private Set<No> adjacentes = new HashSet<>();
    //representa o estado do nó na execução do algoritmo
    private Cor cor;
    private String name;

    public No(String name) {
        this.name = name;
        cor = new Branco();
    }

    /**
     * Recebe uma lista que deve ser populada com os nós do grafo na ordem que terminaram de ser executados pelo algoritmo.
     * @param list lista que deve ser populada com os nós do grafo
     */
    public void buscaProfundidade(List<No> list) {
        cor.busca(this, list);
    }

    /**
     * Nos adjacentes
     * @return retorna um Set<No> de nos adjacentes
     */
    public Set<No> getAdjacentes() {
        return adjacentes;
    }

    /**
     * Adciona um no adjacente na estrutura Set<No> 
     * @param adj no adjacente
     */
    public void addAdjacentes(No adj) {
        adjacentes.add(adj);
    }

    /**
     * Dada uma lista seta o no corrente para a cor passada
     * @param cor Cor passada no no corrente
     * @param list lista de nos
     */
    public void setCor(Cor cor, List<No> list) {
        this.cor = cor;
        cor.assumiu(this, list);
    }

    public String toString() {
        return name;
    }
}