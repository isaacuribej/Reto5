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
public interface ListaSoldado {
    public Berserker[] listBerserker= new Berserker[100];
    public void agregar(Berserker o, int i);
    public void eliminar(int i);
    public void obtener(int i);
    
}
