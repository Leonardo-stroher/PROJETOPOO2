/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import javax.swing.Icon;

/**
 *
 * @author s.lucas
 */
public class Jogo {
    private int pkjogo;
    private String nomejog;
    private double precojog;
    private String lojajog;
    private String descricaojog;
    private Icon imagemJogo;

    public int getPkjogo() {
        return pkjogo;
    }

    public void setPkjogo(int pkjogo) {
        this.pkjogo = pkjogo;
    }

    public String getNomejog() {
        return nomejog;
    }

    public void setNomejog(String nomejog) {
        this.nomejog = nomejog;
    }

    public double getPrecojog() {
        return precojog;
    }

    public void setPrecojog(double precojog) {
        this.precojog = precojog;
    }

    public String getLojajog() {
        return lojajog;
    }

    public void setLojajog(String lojajog) {
        this.lojajog = lojajog;
    }

    public String getDescricaojog() {
        return descricaojog;
    }

    public void setDescricaojog(String descricaojog) {
        this.descricaojog = descricaojog;
    }

    public Icon getImagemJogo() {
        return imagemJogo;
    }

    public void setImagemJogo(Icon imagemJogo) {
        this.imagemJogo = imagemJogo;
    }
    
    @Override
      public String toString(){
          return "Usuario {" + "pk do jogo" + getPkjogo() + ", nome jogo-" + getNomejog() + ", preço jogo" +
                  getPrecojog() + ", descrição" + descricaojog + '}';
      }
    
}
