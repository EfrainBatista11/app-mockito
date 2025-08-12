package org.ebatista.appmockito.ejemplos.repositories;

import org.ebatista.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();

}
