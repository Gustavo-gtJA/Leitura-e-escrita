package be.com.teixeira.gustavo.leitura_escrita.repository;

import be.com.teixeira.gustavo.leitura_escrita.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ContatoRepository {

    public Contato contato;

    public void gravar(){
        Path arquivo = Paths.get("/Users/25203634/Arquivos/dados.csv");
        try {
            Files.writeString(arquivo, contato.separarDadosContato(), StandardOpenOption.APPEND);
            System.out.println("Contato gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();
        }

    }
}
