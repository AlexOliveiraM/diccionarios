package com.curso.diccionarios.dominio.model;

import java.util.List;

public interface Significado {

    Integer getNumero();

    String getDefinicion();

    List<String> getEjemplos();

    Palabra getPalabra();

    List<Significado> getSignificados();

    List<Contexto> getContextos();

    List<TipoMorfologico> getTiposMorfologicos();

}