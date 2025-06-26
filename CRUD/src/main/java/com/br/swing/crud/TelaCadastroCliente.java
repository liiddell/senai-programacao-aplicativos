package com.br.swing.crud;

import javax.swing.*;
import java.awt.*;
import com.br.senai.crud.Cliente;
import com.br.senai.crud.dao.ClienteDAO;

public class TelaCadastroCliente extends JFrame {
    public TelaCadastroCliente() {
        setTitle("Cadastro de Cliente");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel painel = new PainelAero();
        painel.setLayout(new GridLayout(4, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField campoNome = new JTextField();
        JTextField campoEmail = new JTextField();
        JTextField campoTelefone = new JTextField();
        JButton btnSalvar = new BotaoAero("Salvar");

        painel.add(new JLabel("Nome:")).setFont(new Font("Segoe UI", Font.PLAIN, 14));
        painel.add(campoNome);
        painel.add(new JLabel("Email:")).setFont(new Font("Segoe UI", Font.PLAIN, 14));
        painel.add(campoEmail);
        painel.add(new JLabel("Telefone:")).setFont(new Font("Segoe UI", Font.PLAIN, 14));
        painel.add(campoTelefone);
        painel.add(new JLabel());
        painel.add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            String nome = campoNome.getText();
            String email = campoEmail.getText();
            String telefone = campoTelefone.getText();

            if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
                return;
            }

            Cliente cliente = new Cliente(nome, email, telefone);
            new ClienteDAO().salvar(cliente);
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
            dispose();
        });

        add(painel);
        setVisible(true);
    }
}
