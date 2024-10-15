package com.curso.diccionarios.dominio.repository;

import com.curso.diccionarios.dominio.model.TipoMorfologico;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

public interface TipoMorfologicoRepository {

    Optional<TipoMorfologico> getTipoMorfologico(@NonNull String tipoMorfologico);

    List<TipoMorfologico> getTiposMorfologicos();

    void newTipoMorfologico(@NonNull TipoMorfologico tipoMorfologico);

    void updateTipoMorfologico(@NonNull TipoMorfologico tipoMorfologico);

    void deleteTipoMorfologico(@NonNull TipoMorfologico tipoMorfologico);
}
