package Comando;

import Variavel.*;
import Expressao.*;

public class ComandoAtrib extends Comando {

    char variavel;
    Expressao exp;
    int linha;

    public ComandoAtrib(int lin, char var, Expressao raizArvoreExpressao) {
        variavel=var;
        exp=raizArvoreExpressao;
        linha=lin;
    }

    public int executa() {
        
      Variaveis.var[variavel-97]= exp.avalia();
      return linha+1;
    }
}
