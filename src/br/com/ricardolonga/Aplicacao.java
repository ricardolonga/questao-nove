package br.com.ricardolonga;

public class Aplicacao {

    public static void main(String[] args) {
        Turma turmaPadrao = new TurmaPadrao();
        System.out.println("Preço da turma padrão: " + turmaPadrao.precoVaga());

        turmaPadrao.addMatricula(new Matricula());
        turmaPadrao.cancelarMatricula(new Matricula());

        Turma turmaPromocional = new TurmaPromocional();
        System.out.println("Preço da turma promocional: " + turmaPromocional.precoVaga());

        turmaPromocional.addMatricula(new Matricula());
        turmaPromocional.cancelarMatricula(new Matricula());
    }
    
}
