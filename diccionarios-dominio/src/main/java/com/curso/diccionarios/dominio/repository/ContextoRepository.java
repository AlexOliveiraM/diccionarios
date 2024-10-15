package com.curso.diccionarios.dominio.repository;

import com.curso.diccionarios.dominio.model.Contexto;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

public interface ContextoRepository {

    Optional<Contexto> getContexto(@NonNull String contexto);

    List<Contexto> getContextos();

    void newContexto(@NonNull Contexto contexto);

    void updateContexto(@NonNull Contexto contexto);

    void deleteContexto(@NonNull Contexto contexto);

}