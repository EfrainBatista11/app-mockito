package org.ebatista.appmockito.ejemplos.repositories;

import org.ebatista.appmockito.ejemplos.Datos;
import org.ebatista.appmockito.ejemplos.models.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class ExamenRepositoryImpl implements ExamenRepository{
    @Override
    public Examen guardar(Examen examen) {
        System.out.println("ExamenRepositoryImpl.guardar");
        return Datos.EXAMEN;
    }

    @Override
    public List<Examen> findAll() {
        System.out.println("ExamenRepositoryImpl.findAll");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Datos.EXAMENES;
    }


}