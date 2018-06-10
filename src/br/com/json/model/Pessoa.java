/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.json.model;

/**
 *
 * @author Silvana
 */
public class Pessoa {
    String PP1;
    String PP2;
    String PP3;
    String PP4;
    String PP5;
    String A1;
    String A2;
    String A3;
    String S;
    String PVT;

    public Pessoa(String PP1, String PP2, String PP3, String PP4, String PP5, String A1, String A2, String A3, String S, String PVT) {
        this.PP1 = PP1;
        this.PP2 = PP2;
        this.PP3 = PP3;
        this.PP4 = PP4;
        this.PP5 = PP5;
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
        this.S = S;
        this.PVT = PVT;
    }
    

    public String getPP1() {
        return PP1;
    }

    public String getPP2() {
        return PP2;
    }

    public String getPP3() {
        return PP3;
    }

    public String getPP4() {
        return PP4;
    }

    public String getPP5() {
        return PP5;
    }

    public String getA1() {
        return A1;
    }

    public String getA2() {
        return A2;
    }

    public String getA3() {
        return A3;
    }

    public String getS() {
        return S;
    }

    public String getPVT() {
        return PVT;
    }
    
}
