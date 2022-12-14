/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp.paintbrush.classes;

import java.awt.Graphics;
import java.util.Random;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Spray extends Ponto {

    private double raio = 20;


    public void desenha(Graphics g) {
        Random rd = new Random();
        for (int i = 0; i < 500; i++) {
            if (y != 0) {
                int xNew = (int) ( x + rd.nextGaussian() * raio);
                int yNew = (int) ( y + rd.nextGaussian() * raio);
                g.setColor(cor);
                g.drawLine(xNew, yNew, xNew, yNew);
            }
        }
    }
}