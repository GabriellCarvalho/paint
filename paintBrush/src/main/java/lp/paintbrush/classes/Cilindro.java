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
public class Cilindro extends D3 {

    private int raio;

    @Override
    public void desenha(Graphics g) {
        super.desenha(g);
        g.setColor(corInterna);
        //g.fillOval(x, y, 2*raio, raio);
        //g.fillOval(x, y+altura, 2*raio, raio);

        g.setColor(cor);
        g.drawOval(x, y, 2 * raio, raio);
        g.drawOval(x, y + altura, 2 * raio, raio);
        g.drawLine(x, y+(raio/2), x, y + altura + raio/2);
        g.drawLine(x + 2 * raio, y+(raio/2), x + 2 * raio, y + altura + raio/2);
    }

    @Override
    public float volume() {
        return (float) (Math.PI * (raio * raio) * altura);
    }
}
