package com.mycompany.polimorfismo;

public class Polimorfismo {
    public static void main(String[] args){
          Animal[] listaDeAnimais = new Animal[5];
          
          listaDeAnimais[0] = new Gato();
          listaDeAnimais[1] = new Cachorro();
          listaDeAnimais[2] = new Vaca();
          listaDeAnimais[3] = new Galo();
          listaDeAnimais[4] = new Elefante();
          
          
          for (int i = 0; i < listaDeAnimais.length; i++){
              listaDeAnimais[i].fale();
          }
       }
    }
