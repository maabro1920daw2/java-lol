/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.ArrayList;

import builds.Build;

public class Usuario {

    private int code;
    private String nombre, password;
    private Elo elo;
    private ArrayList<Build> builds = new ArrayList<Build>();

    public Usuario() {
    }

    public Usuario(int code, String nombre, String password, Elo elo) {
        super();
        this.code = code;
        this.nombre = nombre;
        this.password = password;
        this.elo = elo;
    }
    
    @Override
    public String toString(){
        return "Usuario: "+nombre+"\nLiga: "+elo.getNombreLiga();
    }

    public void registrarUsuario(String us, String pas) {
    }

    public int getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public Elo getElo() {
        return elo;
    }

    public ArrayList<Build> getBuilds() {
        return builds;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setElo(Elo elo) {
        this.elo = elo;
    }

}
