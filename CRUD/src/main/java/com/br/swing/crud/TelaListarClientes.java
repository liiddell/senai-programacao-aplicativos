package com.br.swing.crud;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.br.senai.crud.Cliente;
import com.br.senai.crud.dao.ClienteDAO;

public class TelaListarClientes extends JFrame {
    public TelaListarClientes() {
        setTitle("Lista de Clientes");
        setSize(500, 300);
        setLocationRelativeTo(null);

        JPanel painel = new PainelAero();
        painel.setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        areaTexto.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);
        painel.add(scroll, BorderLayout.CENTER);

        List<Cliente> clientes = new ClienteDAO().listarTodos();
        if (clientes != null && !clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                areaTexto.append("ID: " + cliente.getId() +
                        " | Nome: " + cliente.getNome() +
                        " | Email: " + cliente.getEmail() +
                        " | Telefone: " + cliente.getTelefone() + "\n");
            }
        } else {
            areaTexto.setText("Nenhum cliente cadastrado.");
        }

        add(painel);
        setVisible(true);
    }
}
