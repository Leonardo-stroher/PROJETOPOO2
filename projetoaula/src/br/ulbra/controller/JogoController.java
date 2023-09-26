/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.controller;

import br.ulbra.model.Jogo;
import br.ulbra.model.JogoDAO;

/**
 *
 * @author s.lucas
 */
public class JogoController {
    
     private JogoDAO jogoDAO;

    public JogoController() {
        jogoDAO = new JogoDAO();
    }
    
     public Jogo readForPKjogo(int pk) {
        return jogoDAO.readForPKjogo(pk);

    }
    
}
