package br.com.alura.screenmatch3.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
