/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;

/**
 *
 * @author ACER
 */
public class Batallon implements ListaSoldado{
    public Batallon(){
        
    }

    
    @Override
    public void agregar(Berserker o, int i) throws CustomException{
        if (i>100){
            throws new CustomException("El berserker que se quiere agregar sobrepasa el maximo limite del batallón");
        }
        else{
            listBerserker[i]=o;
        }
    }

     
    @Override
    public void eliminar(int i) throws CustomException{
        if (listBerserker[i]==null){
            throws new CustomException("No se puede eliminar un berserker inexistente...");
        }
        else{
            listBerserker[i]=null;
        }
    }

    
    
    @Override 
    public void obtener(int i) throws CustomException{
        if (listaBerserker[i]==null){
            throws new CustomException("No se ha podido obtener el berserker...");
        }
        else{
            System.out.println(listBerserker[i].getNickName());
        }
    }
    
    
}
