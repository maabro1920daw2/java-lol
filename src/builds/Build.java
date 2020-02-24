/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builds;

import campeones.Campeon;
import objetos.Objeto;
import usuarios.Usuario;

public class Build {

    private String nombre;
    private int codeBuild;
    private Usuario user;
    private Campeon champ;
    private Objeto[] items;

    public Build(String nombre, Usuario user, Campeon champ, Objeto[] items) {
        super();
        this.nombre = nombre;
        this.user = user;
        this.champ = champ;
        this.items = items;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodeBuild() {
        return codeBuild;
    }

    public Usuario getUser() {
        return user;
    }

    public Campeon getChamp() {
        return champ;
    }

    public Objeto[] getItems() {
        return items;
    }

}
