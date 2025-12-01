package be.com.teixeira.gustavo.leitura_escrita.model;

public class Contato {
    public String nome;
    public String id;
    public String email;
    public String telefone;

    public String separarDadosContato(){
        String contatoSeparado = id + ";" + nome + ";" + email + ";" + telefone + "\n";
        return contatoSeparado;
        }
    }

