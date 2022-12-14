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
public class Circulo extends D2 {

    private int raio;

    @Override
    public void desenha(Graphics g) {
        super.desenha(g);
        g.setColor(corInterna);
        g.fillOval(x, y, (int) perimetro(), (int) perimetro());
        g.setColor(cor);
        g.drawOval(x, y, (int) perimetro(), (int) perimetro());
    }

    @Override
    public float area() {
        return (float) (Math.PI * (raio * raio));
    }

    @Override
    public float perimetro() {
        return raio*2;
    }

}
