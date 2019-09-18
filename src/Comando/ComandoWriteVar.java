package Comando;

import java.io.*;
import java.util.*;
import Variavel.Variaveis;

import lp.*;

public class ComandoWriteVar extends Comando {

    char variavel;

    public ComandoWriteVar(int lin, String txt) {
        linha = lin;
        variavel = txt.charAt(0);
    }

    public int executa() {
        System.out.println(Variaveis.var[(int) this.variavel - 97]);
        return linha + 1;
    }
}
