/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp.paintbrush.classes;

import java.awt.Graphics;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class Retangulo extends D2 {

    private int base;
    private int largura;

    @Override
    public void desenha(Graphics g) {
        super.desenha(g);
        g.setColor(corInterna);
        g.fillRect(x, y, base, largura);
        g.setColor(cor);
        g.drawRect(x, y, base, largura);
    }

    @Override
    public float area() {
        return base * largura;
    }

    @Override
    public float perimetro() {
        return 2 * (base + largura);
    }

}
