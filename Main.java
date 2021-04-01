class Aluno{
  String nome;
  String endereco;
  String telefone;
  String email;
  String matricula;
}


class Main {
  public static void main(String[] args) {
   Aluno aluno1 = new Aluno();
   aluno1.nome = "Teste Nome Aluno";
   aluno1.endereco = "Rua da Casa Teste";
   aluno1.telefone = "99-9999-9999";
   aluno1.email = "aluno1teste@email.com";
   aluno1.matricula = "matricula01";
  System.out.println(aluno1.nome);

  }
}