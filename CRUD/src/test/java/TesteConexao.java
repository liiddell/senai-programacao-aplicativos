package com.exemplo.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteConexao {

    @Test
    public void ConectarComBancoDeDados() {
        try {
            // Cria a SessionFactory a partir do arquivo hibernate.cfg.xml
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

            // Abre uma sessão com o banco
            Session session = sessionFactory.openSession();

            // Verifica se a sessão foi criada com sucesso
            assertNotNull(session);
            assertTrue(session.isOpen());

            // Fecha a sessão e a factory após o teste
            session.close();
            sessionFactory.close();
        } catch (Exception e) {
            fail("Falha ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}

