//<img src="https://embed.creately.com/2tcvxbXOViq?type=svg">
package auladia280920;
public class Pessoa {
  private int id;
  private String nome; 
  private String cpf; 
  private String sexo; 
  private String endereço; 
  private String cidade;
  private String estado;

    public Pessoa(String nome, String cpf, String sexo, String endereço, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
    
    public void setId(int id) {
        this.id= id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
