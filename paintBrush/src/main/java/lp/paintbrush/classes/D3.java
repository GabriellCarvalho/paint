/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp.paintbrush.classes;

import java.awt.Color;
import java.awt.Graphics;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class D3 extends Ponto {

    protected Color corInterna;
    protected int altura;
    protected boolean showArea = false;

    @Override
    public void desenha(Graphics g) {
        if (showArea) {
        g.setColor(cor);
        g.drawString(Float.toString(volume()), x - 10, y - 10);
        }
    }

    public abstract float volume();
}
