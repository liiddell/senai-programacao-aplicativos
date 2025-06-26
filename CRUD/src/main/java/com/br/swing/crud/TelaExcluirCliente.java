package com.br.swing.crud;

import javax.swing.*;
import java.awt.*;
import com.br.senai.crud.Cliente;
import com.br.senai.crud.dao.ClienteDAO;

public class TelaExcluirCliente extends JFrame {
    public TelaExcluirCliente() {
        setTitle("Excluir Cliente");
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel painel = new PainelAero();
        painel.setLayout(new GridLayout(5, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextField campoId = new JTextField();
        JLabel labelInfo = new JLabel("Cliente: ", JLabel.CENTER);
        JButton btnBuscar = new BotaoAero("Buscar");
        JButton btnExcluir = new BotaoAero("Excluir");

        painel.add(new JLabel("Digite o ID do cliente:"));
        painel.add(campoId);
        painel.add(btnBuscar);
        painel.add(labelInfo);
        painel.add(btnExcluir);

        btnExcluir.setEnabled(false);
        final Cliente[] clienteSelecionado = new Cliente[1];

        btnBuscar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(campoId.getText());
                Cliente cliente = new ClienteDAO().buscarPorId(id);
                if (cliente != null) {
                    labelInfo.setText("Cliente: " + cliente.getNome());
                    clienteSelecionado[0] = cliente;
                    btnExcluir.setEnabled(true);
                } else {
                    labelInfo.setText("Cliente não encontrado.");
                    btnExcluir.setEnabled(false);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ID inválido!");
            }
        });

        btnExcluir.addActionListener(e -> {
            if (clienteSelecionado[0] != null) {
                int confirm = JOptionPane.showConfirmDialog(this,
                        "Deseja realmente excluir " + clienteSelecionado[0].getNome() + "?",
                        "Confirmação", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    new ClienteDAO().deletar(clienteSelecionado[0].getId());
                    JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!");
                    dispose();
                }
            }
        });

        add(painel);
        setVisible(true);
    }
}