package Comando;

import java.io.*;  
import java.util.*;

import lp.*; 

class ComandoWriteErr extends Comando {
   
   String texto;
      
   ComandoWriteErr(int lin, String txt) {
      linha = lin;
      texto = txt;
   }
   
   public int executa() {
      System.err.printf(texto);
      return linha+1;
   }
}