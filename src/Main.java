import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PessoaCRUD dao = new PessoaDAO();
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        //adicionar
        Pessoa novaPessoa = dao.adicionar(12, "Rafael", "123", "rafael@hotmail.com");
        listaPessoas.add(novaPessoa);

        Pessoa novaPessoa1 = dao.adicionar(14, "Ricardo", "456", "ricardo@hotmail.com");
        listaPessoas.add(novaPessoa1);

       //listar
       System.out.println("Lista Original");
       for(Pessoa p: listaPessoas){
            dao.listar(p);
       }

       //excluir
       if(!listaPessoas.isEmpty()){
           int idRemover = 12;
           Pessoa dadosPessoa = buscarPessoaPorID(listaPessoas, idRemover);
           if(dadosPessoa != null){
               dao.remover(dadosPessoa);
               listaPessoas.remove(dadosPessoa);
           }else {
               System.out.println("Pessoa não encontrada!!!");
           }
       }else{
           System.out.println("Lista Vazia, impossível excluir");
       }
        //listar
        System.out.println("Lista Após remoção");
        for(Pessoa p: listaPessoas){
            dao.listar(p);
        }
        //atualizar
        if(!listaPessoas.isEmpty()){
            int idAtualizar = 14;
            Pessoa dadosPessoa = buscarPessoaPorID(listaPessoas, idAtualizar);

            if(dadosPessoa != null){
                dao.atualizar(dadosPessoa,"Alex", "44 99889745", "alex@gmail.com");
            }else {
                System.out.println("Pessoa não encontrada!!!");
            }
        }else {
            System.out.println("Lista está vazia, impossível atualizar valores");
        }
        //listar
        System.out.println("Lista após atualização");
        for(Pessoa p: listaPessoas){
            dao.listar(p);
        }
    }
    public static Pessoa buscarPessoaPorID(ArrayList<Pessoa> lista, int id){
        for(Pessoa p: lista){
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}