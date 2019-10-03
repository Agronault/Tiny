package Comando;

import Variavel.*;
import Expressao.*;

public class ComandoIf extends Comando implements Condicao {

    int linhaEnd;
    int linhaIf;
    Expressao exp;

    public ComandoIf(int lin, Expressao raizArvoreExpressao) {
        linhaIf=lin;
        exp= raizArvoreExpressao;
    }

    @Override
    public void setLinhaEnd(int lin) {
        linhaEnd=lin;
    }

    public int executa(Memoria local, Memoria global) {
        
        if(exp.avalia(local, global)==0){
        return linhaEnd;
        }else{
        return linhaIf+1;
        }

    }
}
