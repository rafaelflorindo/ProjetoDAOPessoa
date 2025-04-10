public interface PessoaCRUD {

    Pessoa adicionar(int id, String nome, String telefone, String email);
    public void listar(Pessoa pessoa);
    Pessoa atualizar(Pessoa pessoa, String nome, String telefone, String email);
    public void remover(Pessoa pessoa);

}
