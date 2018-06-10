/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.json.control;

import br.com.json.model.Pessoa;
import java.util.List;

/**
 *
 * @author Caio Fumiya
 */

/*
0-Central
1-PUSP-C
2-Fisica
3-Quimica
*/
public class pontua {
    
    static int[] pontoPP(Pessoa usuario,List<bandeco> bandecos){
        Pessoa user = usuario;
        int[] pontos = {0,0,0,0};
        String PP1 = user.getPP1();
        String PP2 = user.getPP2();
        String PP3 = user.getPP3();
        String PP4 = user.getPP4();
        String PP5 = user.getPP5();
        
        for(bandeco bandec:bandecos){
            if(PP1==bandec.PP){
                    pontos[bandecos.indexOf(bandec)] = 5 ; break;
            }
            if(PP2==bandec.PP){
                    pontos[bandecos.indexOf(bandec)] = 4 ; break;
            }
            if(PP3==bandec.PP){
                    pontos[bandecos.indexOf(bandec)] = 3 ; break;
            }
            if(PP4==bandec.PP){
                    pontos[bandecos.indexOf(bandec)] = 2 ; break;
            }
            if(PP5==bandec.PP){
                    pontos[bandecos.indexOf(bandec)] = 1 ; break;
            }
        }
        return pontos; 
    }
    static int[] pontoA(Pessoa usuario,List<bandeco> bandecos){
        Pessoa user = usuario;
        int[] pontos = {0,0,0,0};
        String A1 = user.getA1();
        String A2 = user.getA2();
        String A3 = user.getA3();
        
        for(bandeco bandec:bandecos){
            if(A1==bandec.A){
                    pontos[bandecos.indexOf(bandec)] = 3 ; break;
            }
            if(A2==bandec.A){
                    pontos[bandecos.indexOf(bandec)] = 2 ; break;
            }
            if(A3==bandec.A){
                    pontos[bandecos.indexOf(bandec)] = 1 ; break;
            }
        }
        return pontos; 
    }
    static int[] pontoS(Pessoa usuario,List<bandeco> bandecos){
        Pessoa user = usuario;
        int[] pontos = {0,0,0,0};
        String S = user.getS();
        
        for(bandeco bandec:bandecos){
            if(S==bandec.S){
                    pontos[bandecos.indexOf(bandec)] = 2 ; break;
            }
        }
        return pontos; 
    }  
    static int[] pontoPVT(Pessoa usuario,List<bandeco> bandecos){
        Pessoa user = usuario;
        int[] pontos = {0,0,0,0};
        String PVT = user.getPVT();
        
        for(bandeco bandec:bandecos){
            if(PVT==bandec.PVT){
                    pontos[bandecos.indexOf(bandec)] = 2 ; break;
            }
        }
        return pontos; 
    } 
    static int[] pontosGeral(Pessoa usuario,List<bandeco> bandecos){
        int[] PP = pontoPP(usuario,bandecos);
        int[] A =  pontoA(usuario,bandecos);
        int[] S =  pontoS(usuario,bandecos);
        int[] PVT = pontoPVT(usuario,bandecos);
        int[] Geral = {0,0,0,0};
        for(int i = 0;i<4;i++){
            Geral[i] = PP[i]+A[i]+S[i]+PVT[i];
        }
        return Geral;
    }
}
