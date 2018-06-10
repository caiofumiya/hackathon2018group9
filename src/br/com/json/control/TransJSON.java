/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.json.control;

import br.com.json.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio Fumiya
 */
public class TransJSON {
    
    static List<Pessoa> retornalista() throws FileNotFoundException{
        Type listapessoa = new TypeToken<List<Pessoa>>() {}.getType();
        List<Pessoa> listaClientes = new ArrayList<>();
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("C:\\Users\\Silvana\\Documents\\GitHub\\JsonNaPratica\\src\\br\\com\\json\\control\\Dados.json"));
        List<Pessoa> listapessoas = gson.fromJson(reader, listapessoa);
        return listapessoas;
    }
}
