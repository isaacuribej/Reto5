/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class Berserker extends Soldado {
    private String nickName;
    private String nombreCompleto;
    private int id;
    private float fuerza;
    // private String[] arrayArma= new String[7];
    private Arma[] lista;

    private float suma;
    private Arma katana;
    private Arma espadaLarga;
    private Arma claymore;
    private Arma cimitarra;
    private Arma dagas;
    private Arma guadana;
    private Arma dinamos;

    public void Berserker() {
        this.lista = new Arma[100];
        this.katana = new Arma();
        this.katana.setArma("Katana");
        this.katana.setPuntajeAtaque(7);
        anadirArray(this.katana, 0);
        this.espadaLarga = new Arma();
        this.espadaLarga.setArma("Espada larga");
        this.espadaLarga.setPuntajeAtaque(9);
        anadirArray(this.espadaLarga,1);
        this.claymore = new Arma();
        this.claymore.setArma("Claymore");
        this.claymore.setPuntajeAtaque(9);
        anadirArray(this.claymore,2);
        this.cimitarra = new Arma();
        this.cimitarra.setArma("Cimitarra");
        this.cimitarra.setPuntajeAtaque(8);
        anadirArray(this.cimitarra,3);
        this.dagas = new Arma();
        this.dagas.setArma("Dagas");
        this.dagas.setPuntajeAtaque(4);
        anadirArray(this.dagas,4);
        this.guadana = new Arma();
        this.guadana.setArma("Guadaña");
        this.guadana.setPuntajeAtaque(11);
        anadirArray(this.guadana,5);
        this.dinamos = new Arma();
        this.dinamos.setArma("Dinamos");
        this.dinamos.setPuntajeAtaque(15);
        anadirArray(this.dinamos,6);

    }

    public void setNickName(String nick) {
        nickName = nick;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNombre(String name) {
        nombreCompleto = name;
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public void setId(int x) {
        id = x;
    }

    public int getId() {
        return id;
    }

    public void setFuerza(float x) {
        fuerza = x;
    }

    public float getFuerza() {
        return fuerza;
    }

    // ====================================
    public Arma[] getArrayArmas() {
        return lista;
    }

    public void anadirArray(Arma x, int i) {

        lista[i] = x;
    }

    public Arma getElementoArray(int i) {
        return lista[i];
    }

    public void setArrayArmas(Arma[] x, int y) {
        lista = x;
    }

    @Override
    public float atacar(float x, float y) {
        suma = x + y;
        return suma;
    }

}
