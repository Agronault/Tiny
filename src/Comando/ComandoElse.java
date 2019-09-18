package Comando;

import Variavel.*;

public class ComandoElse extends Comando implements Condicao {

    int linhaEnd;
    int linhaElse;

    public ComandoElse(int lin) {
    linhaElse=lin;
    }

    public void setLinhaEnd(int lin) {
    linhaEnd=lin;
    }

    public int executa() {
            return linhaEnd;
    }
}
