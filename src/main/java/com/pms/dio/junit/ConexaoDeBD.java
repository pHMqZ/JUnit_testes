package com.pms.dio.junit;

import java.util.logging.Logger;

//Classe de exemplo para testar com Junit
public class ConexaoDeBD {
	
	private static final Logger LOGGER = Logger.getLogger(ConexaoDeBD.class.getName());

    public static void iniciaConexao() {
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizaConexao() {
        //fez algo
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no DB
        LOGGER.info("removeu dados");
    }

}
