package app.grafo.cor;

import java.util.List;

import app.grafo.No;

public class Branco extends Cor {
    /**
     * Dada uma lista e um no seta o no passado com a cor cinza
     */
    public void busca(No no, List<No> list){
        no.setCor(new Cinza(), list);
    }

}
