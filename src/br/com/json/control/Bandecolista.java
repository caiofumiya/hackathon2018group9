/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.json.control;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio fumiya
 */

/*
0-Central
1-PUSP-C
2-Fisica
3-Quimica
*/

public class Bandecolista {
    static List<bandeco> inicialista(){
        List<bandeco> lista = new ArrayList<>();
        
        bandeco Central;
        Central = new bandeco(
                "Carne Processada",
                "PVT com legumes/verduras",
                "Verdura/Legumes",
                "Sobremesas industrializadas"); 
        lista.add(Central);
        
        bandeco PUSPC;
        PUSPC = new bandeco(
                "Carne Vermelha",
                "PVT com legumes/verduras",
                "Batata",
                "Frutas");
        lista.add(PUSPC);
        
        bandeco Fisica;
        Fisica = new bandeco(
                "Carne Processada",
                "PVT com legumes/verduras",
                "Verdura/Legumes",
                "Sobremesas industrializadas"); 
        lista.add(Fisica);
        
        bandeco Quimica;
        Quimica = new bandeco(
                "Frango",
                "PVT com legumes/verduras",
                "Verdura/Legumes",
                "Sobremesas industrializadas"); 
        lista.add(Quimica);
        
        return lista;    
    }
}
