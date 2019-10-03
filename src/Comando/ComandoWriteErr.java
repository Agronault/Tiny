package Comando;

import java.io.*;  
import java.util.*;
import Variavel.*;

import lp.*; 

class ComandoWriteErr extends Comando {
   
   String texto;
      
   ComandoWriteErr(int lin, String txt) {
      linha = lin;
      texto = txt;
   }
   
   public int executa(Memoria local, Memoria global) {
      System.err.printf(texto);
      return linha+1;
   }
}