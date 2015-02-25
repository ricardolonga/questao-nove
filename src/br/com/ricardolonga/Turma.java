package br.com.ricardolonga;

/**
 * Created by longa on 24/02/15.
 */
public abstract class Turma {
    
    abstract void addMatricula(Matricula matricula);
    
    abstract void cancelarMatricula(Matricula matricula);
    
    abstract double precoVaga();

}
