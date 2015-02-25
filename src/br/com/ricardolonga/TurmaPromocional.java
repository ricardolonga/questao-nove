package br.com.ricardolonga;

/**
 * Created by longa on 24/02/15.
 */
public class TurmaPromocional extends Turma {

    @Override
    void addMatricula(Matricula matricula) {
        System.out.println("Adicionado uma matricula...");
    }

    @Override
    void cancelarMatricula(Matricula matricula) {
        System.out.println("Cancelado uma matricula...");
    }

    @Override
    double precoVaga() {
        return 90;
    }
    
}
