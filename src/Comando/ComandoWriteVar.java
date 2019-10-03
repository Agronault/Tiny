package Comando;

import java.io.*;
import java.util.*;
import Variavel.Variaveis;

import lp.*;
import Variavel.*;

public class ComandoWriteVar extends Comando {

    char variavel;

    public ComandoWriteVar(int lin, String txt) {
        linha = lin;
        variavel = txt.charAt(0);
    }

    public int executa(Memoria local, Memoria global) {
        
        if(local.var[variavel-97] != Double.NEGATIVE_INFINITY){
             System.out.println(local.var[this.variavel - 97]);
         }else{
             System.out.println(global.var[this.variavel - 97]);
         }
        
        return linha + 1;
    }
}
