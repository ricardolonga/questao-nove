package br.com.ricardolonga;

import java.util.Arrays;

public class Aplicacao {

    public static void main(String[] args) {
        Turma turmaPadrao = new TurmaPadrao();

        System.out.println(turmaPadrao.precoVaga());
        turmaPadrao.addMatricula(new Matricula());
        turmaPadrao.cancelarMatricula(new Matricula());

        Turma turmaPromocional = new TurmaPromocional();

        System.out.println(turmaPromocional.precoVaga());
        turmaPromocional.addMatricula(new Matricula());
        turmaPromocional.cancelarMatricula(new Matricula());
    }
    
}
