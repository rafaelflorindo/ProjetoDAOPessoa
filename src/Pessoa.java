public class Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Pessoa(int id, String nome, String telefone, String email){
        this.setNome(nome);
        this.setEmail(email);
        this.setId(id);
        this.setTelefone(telefone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "ID =" + id +
                ", Nome ='" + nome + '\'' +
                ", Telefone ='" + telefone + '\'' +
                ", E-mail ='" + email + '\'' +
                '}';
    }
}
