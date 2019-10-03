package Comando;

import Variavel.*;
import Expressao.*;

public class ComandoFor extends Comando {

    int linhaEnd;
    int varValor;
    double limite;
    char variavel;
    String tipo;
    Expressao exp;
    boolean inicio = true;

    public ComandoFor(int lin, String var, String vValor, String tipo, Expressao raizArvoreExpressao) {
        this.linha = lin;
        this.tipo = tipo;
        this.exp = raizArvoreExpressao;
        this.variavel = var.toCharArray()[0];
        this.varValor = Integer.parseInt(vValor);
    }

    public char getVar() {
        return variavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setLinhaEnd(int lin) {
        this.linhaEnd = lin;
    }

    public int executa(Memoria local, Memoria global) {

        limite = exp.avalia(local, global);

        if (inicio == true) {
            inicio = false;
            //System.out.println("limite= "+ exp.avalia());
                local.var[variavel - 97] = varValor;
        }

        if (tipo.equalsIgnoreCase("downto")) {
            if (local.var[variavel - 97] >= limite) {
                return linha + 1;
            } else {
                inicio = true;
                return linhaEnd + 1;
            }
        } else {
            if (local.var[variavel - 97] <= limite) {
                return linha + 1;
            } else {
                inicio = true;
                return linhaEnd + 1;
            }
        }

    }
}
