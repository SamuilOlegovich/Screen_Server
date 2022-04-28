package com.screen.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Service
//@Scope("prototype") // если оставить будет много окон разного цвета
public abstract class ColorFrame extends JFrame {
    // можно сделать и в закомментированом варианте - будет работать, но профессиональней через абстрактый метод и ...

//    @Autowired
//    private Color color;

    public ColorFrame() throws HeadlessException {
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(5120), random.nextInt(2880));
//        getContentPane().setBackground(color);
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();



}
