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
public class Piramide extends D3 {

    private int base;
    private int largura;

    @Override
    public void desenha(Graphics g) {
        super.desenha(g);
        g.setColor(corInterna);
        //g.fill3DRect(x, y, base, largura, true);
        
        
        g.setColor(cor);
        g.draw3DRect(x, y, base, largura, true);
        g.drawLine(x, y, x+base/2, y-altura);
        g.drawLine(x+base, y, x+base/2, y-altura);
        g.drawLine(x, y+largura, x+base/2, y-altura);
        g.drawLine(x+base, y+largura, x+base/2, y-altura);
    }

    @Override
    public float volume() {
        return ((base * largura)*altura)/3;
    }
}
