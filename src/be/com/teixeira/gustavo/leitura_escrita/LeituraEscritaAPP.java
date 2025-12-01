package be.com.teixeira.gustavo.leitura_escrita;

import be.com.teixeira.gustavo.leitura_escrita.model.Contato;
import be.com.teixeira.gustavo.leitura_escrita.repository.ContatoRepository;

import java.util.Scanner;
import java.util.UUID;

public class LeituraEscritaAPP {
    public static void main(String[] args) {
        System.out.println("Leitura Escrita Escrita");
        Scanner leitor = new Scanner(System.in);

        Contato contato = new Contato();
        System.out.println("Digite o nome do contato: ");
        contato.nome = leitor.nextLine();
        System.out.println("Digite o email do contato: ");
        contato.email = leitor.nextLine();
        System.out.println("Digite o telefone do contato: ");
        contato.telefone = leitor.nextLine();
        contato.id = UUID.randomUUID().toString();

        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.contato = contato;
        contatoRepository.gravar();

        contatoRepository.exibirContato();

    }
}
