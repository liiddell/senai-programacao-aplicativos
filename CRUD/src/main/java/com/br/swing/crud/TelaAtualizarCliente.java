package com.br.swing.crud;
import javax.swing.*;
import java.awt.*;
import com.br.senai.crud.Cliente;
import com.br.senai.crud.dao.ClienteDAO;

public class TelaAtualizarCliente extends JFrame {
    public TelaAtualizarCliente() {
        setTitle("Atualizar Cliente");
        setSize(400, 350);
        setLocationRelativeTo(null);

        JPanel painel = new PainelAero();
        painel.setLayout(new GridLayout(6, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField campoId = new JTextField();
        JTextField campoNome = new JTextField();
        JTextField campoEmail = new JTextField();
        JTextField campoTelefone = new JTextField();
        JButton btnBuscar = new BotaoAero("Buscar");
        JButton btnAtualizar = new BotaoAero("Atualizar");

        painel.add(new JLabel("ID do cliente:"));
        painel.add(campoId);
        painel.add(new JLabel()); painel.add(btnBuscar);
        painel.add(new JLabel("Nome:")); painel.add(campoNome);
        painel.add(new JLabel("Email:")); painel.add(campoEmail);
        painel.add(new JLabel("Telefone:")); painel.add(campoTelefone);
        painel.add(new JLabel()); painel.add(btnAtualizar);

        campoNome.setEnabled(false);
        campoEmail.setEnabled(false);
        campoTelefone.setEnabled(false);
        btnAtualizar.setEnabled(false);

        btnBuscar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(campoId.getText());
                Cliente cliente = new ClienteDAO().buscarPorId(id);
                if (cliente != null) {
                    campoNome.setText(cliente.getNome());
                    campoEmail.setText(cliente.getEmail());
                    campoTelefone.setText(cliente.getTelefone());
                    campoNome.setEnabled(true);
                    campoEmail.setEnabled(true);
                    campoTelefone.setEnabled(true);
                    btnAtualizar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ID inválido!");
            }
        });

        btnAtualizar.addActionListener(e -> {
            int id = Integer.parseInt(campoId.getText());
            Cliente cliente = new ClienteDAO().buscarPorId(id);
            if (cliente != null) {
                cliente.setNome(campoNome.getText());
                cliente.setEmail(campoEmail.getText());
                cliente.setTelefone(campoTelefone.getText());
                new ClienteDAO().atualizar(cliente);
                JOptionPane.showMessageDialog(this, "Cliente atualizado!");
                dispose();
            }
        });

        add(painel);
        setVisible(true);
    }
}
