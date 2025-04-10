public class PessoaDAO implements PessoaCRUD {

    @Override
    public Pessoa adicionar(int id, String nome, String telefone, String email) {
        /*Pessoa pes = new Pessoa(id, nome, telefone, email);
        return pes;*/
        return new Pessoa(id, nome, telefone, email);
    }

    @Override
    public void listar(Pessoa pessoa) {
        System.out.println(pessoa);
    }

    @Override
    public Pessoa atualizar(Pessoa pessoa, String nome, String telefone, String email) {
        pessoa.setNome(nome);
        pessoa.setEmail(email);
        pessoa.setTelefone(telefone);
        return pessoa;
    }

    @Override
    public void remover(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " removida com sucesso");
        //pessoa = null;
    }
}
