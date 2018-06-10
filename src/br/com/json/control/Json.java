/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.json.control;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import br.com.json.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/**
 *
 * @author Caio Fumiya
 */
public class Json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Pessoa usuario = new Pessoa(
        "Massa",
        "Frango",
        "Carne Vermelha",
        "Carne Processada",
        "Ovo",
        "Massa",
        "Batata",
        "Milho",
        "Sobremesas Industrializadas",
        "Outras opcoes vegetarianas (Torta, Almondega, etc)");
        
        List<bandeco> bandecos = Bandecolista.inicialista();
        int[] pontosuser = pontua.pontosGeral(usuario,bandecos);
        
        int[] colocacaouser={-1,-1,-1,-1};
        int maior = 0;
        for(int j = 0;j<4;j++){
            for(int i = 0;i<4;i++){
                    if((pontosuser[i] > pontosuser[maior] && colocacaouser[i] == -1)|| colocacaouser[maior] != -1)
                    maior = i;
            }
            colocacaouser[maior] = j;
        } 
        
        List<Pessoa> listapessoas = TransJSON.retornalista();
        
        int [] Geral = {0,0,0,0};
        
        for(Pessoa pessoalista: listapessoas){
            int[] aux = pontua.pontosGeral(pessoalista,bandecos);
            for(int i = 0;i<4;i++){
                Geral[i] += aux[i];
            }
        }
       
        int[] colocacaogeral={-1,-1,-1,-1};
        maior = 0;
        for(int j = 0;j<4;j++){
            for(int i = 0;i<4;i++){
                    if((Geral[i] > Geral[maior] && colocacaogeral[i] == -1)|| colocacaogeral[maior] != -1)
                    maior = i;
            }
            colocacaogeral[maior] = j;
        }
        
        comunicacaojs resposta = new comunicacaojs(colocacaouser,colocacaogeral);
        
        Gson gson = new Gson();
        String json = gson.toJson(resposta);
        
        FileWriter writer = null;
        try {
          writer = new FileWriter("resposta.json");
          writer.write(json);
        } catch (IOException e) {
          e.printStackTrace();
        } finally {
          if (writer != null) {
           try {
            writer.close();
           } catch (IOException e) {
            e.printStackTrace();
           }
          }
 }
        
//        for(Pessoa pessoaRetorno: listapessoas){
//          System.out.println( (pessoaRetorno.getPP1())!= null ? pessoaRetorno.getPP1():"");
//          System.out.println( (pessoaRetorno.getPP2())!= null ? pessoaRetorno.getPP2():"");
//          System.out.println( (pessoaRetorno.getPP3())!= null ? pessoaRetorno.getPP3():"");
//          System.out.println( (pessoaRetorno.getPP4())!= null ? pessoaRetorno.getPP4():"");
//          System.out.println( (pessoaRetorno.getPP5())!= null ? pessoaRetorno.getPP5():"");
//          System.out.println( (pessoaRetorno.getA1())!= null ? pessoaRetorno.getA1():"");
//          System.out.println( (pessoaRetorno.getA2())!= null ? pessoaRetorno.getA2():"");
//          System.out.println( (pessoaRetorno.getA3())!= null ? pessoaRetorno.getA3():"");
//          System.out.println( (pessoaRetorno.getS())!= null ? pessoaRetorno.getS():"");
//          System.out.println( (pessoaRetorno.getPVT())!= null ? pessoaRetorno.getPVT():"");
//          System.out.println("------------------------------------------------------");
//        }
        
           
    }
    
}
