package app.grafo.cor;

import java.util.List;

import app.grafo.No;

public class Cinza extends Cor{
    public void assumiu(No no, List<No> list){
        //para cada no adjacente da lista dos adjacentes do no faz a buscaProfundidade
        for(No adj : no.getAdjacentes()){
            adj.buscaProfundidade(list);
        }
        //apos fazer a busca em profundide em todos os nos seta o no corrente como Preto
        no.setCor(new Preto(), list);
    }
}