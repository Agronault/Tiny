package Comando;

import Variavel.*;

public class ComandoEndfor extends Comando {

    int linhaFor;
    char variavel;
    String tipo;

    public ComandoEndfor(int lin, int linFor, char var, String tipo) {
        this.linha = lin;
        this.linhaFor = linFor;
        this.variavel = var;
        this.tipo = tipo;
    }

    public int executa(Memoria local, Memoria global) {

        if (tipo.equalsIgnoreCase("downto")) {
            local.var[variavel - 97]--;
        } else {
            local.var[variavel - 97]++;
        }

        return linhaFor;

    }
}
