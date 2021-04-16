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
public class Arma {
    private String arma;
    private int idArma;
    private float puntajeDefensa;
    private float puntajeAtaque;
    
    

    
    
    
    
    public void setPuntajeAtaque(float x){
        puntajeAtaque=x;
    }
    public float getPuntajeAtaque(){
        return puntajeAtaque;
    }
    public void setPuntajeDefensa(float x){
        puntajeDefensa=x;
    }
    public float getPuntajeDefensa(){
        return puntajeDefensa;
    }
    public void setID(int x){
        idArma=x;
    }
    public int getID(){
        return idArma;
    }
    public void setArma(String x){
        arma=x;
    }
    public String getArma(){
        return arma;
    }
    


    
}
