package Comando;

import java.io.*;
import java.util.*;
import Variavel.Variaveis;

import lp.*;

public class ComandoRead extends Comando {

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    char variavel;

    public ComandoRead(int lin, String txt) {
        linha = lin;
        variavel = txt.charAt(0);
    }

    public int executa() {

        try {
            Variaveis.var[(int) variavel - 97] = Float.parseFloat(teclado.readLine());
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
        return linha + 1;
    }
}
