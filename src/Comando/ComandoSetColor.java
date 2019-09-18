package Comando;

import Variavel.Variaveis;
import java.io.*;  
import java.util.*;

import lp.*; 

class ComandoSetColor extends Comando {
   
   String cor;
   int linha;
      
   ComandoSetColor(int lin, String color) {
      linha = lin;
      cor = color;
   }
   
   public int executa() {
      Variaveis.colorset= cor;
      return linha+1;
   }
}