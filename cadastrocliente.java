
package auladia280920;

public class cadastrocliente {

    public static void main(String[] args) {
       UIcadastro formulariocadastro = new UIcadastro();
       Pessoa cliente=new Pessoa(formulariocadastro.nome, formulariocadastro.cpf,formulariocadastro.sexo,
               formulariocadastro.endereço,formulariocadastro.cidade,formulariocadastro.estado);
    }
    
}
