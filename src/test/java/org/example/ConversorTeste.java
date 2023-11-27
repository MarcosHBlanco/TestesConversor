//package org.example;
//
//import org.junit.jupiter.api.*;
//import org.opentest4j.AssertionFailedError;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ConversorTeste {
//    private static final Logger LOGGER = LoggerFactory.getLogger(ConversorTeste.class);
//
//    @Test
//    public void test1() {
//        Conversor conversor = new Conversor();
//        LOGGER.info("Início do Teste 1");
//        double resultado = Conversor.metrosParaMilhas(5000);
//        LOGGER.debug("O valor de resultado é:" + resultado);
//        assertEquals(3.05, resultado);
//        resultado = Conversor.metrosParaMilhas(10000);
//        LOGGER.debug("O valor de resultado é:" + resultado);
//        assertEquals(6.1, resultado);
//        LOGGER.info("Fim do Teste 1");
//    }
//    @Test
//    public void test2(){
//            Conversor conversor = new Conversor();
//            LOGGER.info("Início do Teste 2");
//            double resultado = conversor.metrosParaMilhas(5000);
//            LOGGER.debug("O valor de resultado é:" + resultado);
//            assertThrows(AssertionFailedError.class, () -> {
//                assertEquals(1, resultado);
//            });
//            LOGGER.error("Exceção foi jogada, nenhum erro.");
//            LOGGER.info("Fim do Teste 2");
//        }
//    }
