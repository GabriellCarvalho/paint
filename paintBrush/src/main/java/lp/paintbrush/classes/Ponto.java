/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp.paintbrush.classes;

import java.awt.Color;
import java.awt.Graphics;
import lombok.Data;

@Data
public class Ponto {

    protected int x;
    protected int y;
    protected Color cor;

    public Ponto() {
        this.x = -1;
        this.y = -1;
        this.cor = new Color(255, 0, 0);
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenha(Graphics g) {
        g.setColor(this.cor);
        g.drawLine(x, y, x, y);
    }
}