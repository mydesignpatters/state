package app.grafo.cor;

import java.util.List;

import app.grafo.No;

public class Preto extends Cor {
    public void assumiu(No no, List<No> list){
        list.add(no);
    }
}