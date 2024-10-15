package com.curso.diccionarios.dominio.repository;

import com.curso.diccionarios.dominio.exception.AlreadyExistsEntityException;
import com.curso.diccionarios.dominio.exception.InvalidArgumentException;
import com.curso.diccionarios.dominio.exception.NonExistentEntityException;
import com.curso.diccionarios.dominio.model.Palabra;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

public interface PalabraRepository {

    Optional<Palabra> getPalabra(@NonNull String palabra);

    List<Palabra> getPalabras();

    void newPalabra(@NonNull Palabra palabra) throws InvalidArgumentException, NonExistentEntityException;

    void updatePalabra(@NonNull Palabra palabra) throws InvalidArgumentException, AlreadyExistsEntityException;

    Optional<Palabra> deletePalabra(@NonNull Palabra palabra);

}
