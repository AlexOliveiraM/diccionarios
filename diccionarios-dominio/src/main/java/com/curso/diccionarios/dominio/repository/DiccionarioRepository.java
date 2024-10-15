package com.curso.diccionarios.dominio.repository;

import com.curso.diccionarios.dominio.exception.AlreadyExistsEntityException;
import com.curso.diccionarios.dominio.exception.InvalidArgumentException;
import com.curso.diccionarios.dominio.exception.NonExistentEntityException;
import com.curso.diccionarios.dominio.model.Diccionario;
import com.curso.diccionarios.dominio.model.Idioma;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

public interface DiccionarioRepository {

    Optional<Diccionario> getDiccionario(@NonNull Idioma idioma, @NonNull String nombre);

    List<Diccionario> getDiccionarios(@NonNull Idioma idioma);

    void newDiccionario(@NonNull Diccionario diccionario) throws InvalidArgumentException, AlreadyExistsEntityException;

    void updateDiccionario(@NonNull Diccionario diccionario) throws InvalidArgumentException, NonExistentEntityException;

    Optional<Diccionario> deleteDiccionario(@NonNull Diccionario diccionario);
}