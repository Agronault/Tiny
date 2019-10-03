package Comando;

import Variavel.*;
import Expressao.*;

public class ComandoWhile extends Comando {

    int linhaEnd;
    Expressao exp;

    public ComandoWhile(int lin, Expressao raizArvoreExpressao) {
        linha = lin;
        exp = raizArvoreExpressao;
    }

    public void setLinhaEnd(int lin) {
        linhaEnd = lin;
    }

    @Override
    public int executa(Memoria local, Memoria global) {
        if (exp.avalia(local, global) == 0) {
            return linhaEnd + 1;
        }
            return linha + 1;
        

    }
}