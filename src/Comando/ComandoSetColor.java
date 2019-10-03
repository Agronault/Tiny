package Comando;

import Variavel.*;
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
   
   public int executa(Memoria local, Memoria global) {
      Variaveis.colorset= cor;
      return linha+1;
   }
}