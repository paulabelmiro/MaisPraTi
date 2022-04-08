
package crud;


public class Pessoa {
    private String nome;
    private String cidade;
    private String uf;

    
    public Pessoa(){
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    @Override
    public String toString(){
        return "Pessoa [Nome=" + getNome() + ", Cidade= " + getCidade() + ", UF= " + getUf() + "]";
    }
    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCidade() {
        return cidade;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    public String getUf() {
        return uf;
    }

    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
    
}
