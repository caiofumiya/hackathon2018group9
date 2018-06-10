/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.json.control;

/**
 *
 * @author Caio Fumiya
 */
public class comunicacaojs {
    int [] pontosuser;
    int [] pontosgeral;

    public comunicacaojs(int[] pontosuser, int[] pontosgeral) {
        this.pontosuser = pontosuser;
        this.pontosgeral = pontosgeral;
    }

    public int[] getPontosuser() {
        return pontosuser;
    }

    public int[] getPontosgeral() {
        return pontosgeral;
    }
 }
