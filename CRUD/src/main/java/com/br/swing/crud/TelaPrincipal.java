package com.br.swing.crud;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal() {
        setTitle("Sistema de Gerenciamento de Clientes");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel da esquerda com imagem
        JLabel labelImagem = new JLabel();
        ImageIcon imagem = new ImageIcon("src/main/resources/img/CRUD.png");
        Image imgRedimensionada = imagem.getImage().getScaledInstance(260, 500, Image.SCALE_SMOOTH);
        labelImagem.setIcon(new ImageIcon(imgRedimensionada));
        labelImagem.setHorizontalAlignment(SwingConstants.CENTER);
        labelImagem.setVerticalAlignment(SwingConstants.CENTER);

        JPanel painelImagem = new JPanel();
        painelImagem.setBackground(new Color(255, 255, 255));
        painelImagem.setPreferredSize(new Dimension(260, 500));
        painelImagem.setLayout(new BorderLayout());
        painelImagem.add(labelImagem, BorderLayout.CENTER);

        PainelAero painel = new PainelAero();
        painel.setLayout(new GridLayout(6, 2, 2, 2));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 40));

        painel.add(botaoImagem("src/main/resources/img/cadastrar.png",
                e -> new TelaCadastroCliente()));

        painel.add(botaoImagem("src/main/resources/img/listar.png",
                e -> new TelaListarClientes()));

        painel.add(botaoImagem("src/main/resources/img/atualizar.png",
                e -> new TelaAtualizarCliente()));

        painel.add(botaoImagem("src/main/resources/img/excluir.png",
                e -> new TelaCadastroCliente()));

        painel.add(botaoImagem("src/main/resources/img/sair.png",
                e -> System.exit(0)));

        add(painelImagem, BorderLayout.WEST);
        add(painel, BorderLayout.CENTER);
        setVisible(true);
    }

    private JButton botaoImagem(String caminhoImagem, java.awt.event.ActionListener acao) {
        ImageIcon icone = new ImageIcon(caminhoImagem);
        Image img = icone.getImage().getScaledInstance(200, 60, Image.SCALE_SMOOTH);
        JButton botao = new JButton(new ImageIcon(img));
        botao.setPreferredSize(new Dimension(200, 60));
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
        botao.setFocusPainted(false);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botao.addActionListener(acao);
        return botao;
    }
}