package Comando;

import java.io.*;  
import java.util.*;

import lp.*;
import Variavel.*;

public class ComandoWriteStr extends Comando {
   
   String texto;
   int linha;
   
   public ComandoWriteStr(int lin, String txt) {
      linha = lin;
      texto = txt;
   }
   
   public int executa(Memoria local, Memoria global) {
      System.out.printf(texto);
      return linha+1;
   }
}
