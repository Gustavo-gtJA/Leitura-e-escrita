package be.com.teixeira.gustavo.leitura_escrita.repository;

import be.com.teixeira.gustavo.leitura_escrita.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    public Contato contato;
    private Path arquivo = Paths.get("/Users/25203634/Arquivos/dados.csv");

    public void gravar(){
        try {
            Files.writeString(arquivo, contato.separarDadosContato(), StandardOpenOption.APPEND);
            System.out.println("Contato gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();
        }

    }

    public void exibirContato(){
        try {
            List<String>linhas = Files.readAllLines(arquivo);

            int contador = 0;
            while(contador<linhas.size()){
                System.out.println(linhas.get(contador));
                contador++;
            }
            System.out.println("Contato exibido com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
