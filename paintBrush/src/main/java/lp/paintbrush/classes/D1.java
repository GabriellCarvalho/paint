/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp.paintbrush.classes;

import java.awt.Graphics;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class D1 extends Ponto {

    private int x1;
    private int y1;

    public D1() {
        super();
        this.x1 = -1;
        this.y1 = -1;
    }

    @Override
    public void desenha(Graphics g) {
        g.setColor(this.cor);
        g.drawLine(x, y, x1, y1);
    }

    public float comprimento() {
        return (float) sqrt(pow(x1 - x, 2) + pow(y1 - y, 2));
    }
}
