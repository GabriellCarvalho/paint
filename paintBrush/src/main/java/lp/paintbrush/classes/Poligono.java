/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp.paintbrush.classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Poligono extends Ponto {

    ArrayList<Ponto> pontos = new ArrayList<>();
    private Color corInterna;

    @Override
    public void desenha(Graphics g) {
        pontos.add(new Ponto(x, y));
        g.setColor(cor);
    }

    public void desenharPoligono(Graphics g) {
        int xPoints[] = new int[pontos.size()];
        int yPoints[] = new int[pontos.size()];

        for (int i = 0; i < pontos.size(); i++) {
            xPoints[i] = pontos.get(i).x;
            yPoints[i] = pontos.get(i).y;
        }
        
        Polygon poligono = new Polygon(xPoints, yPoints, pontos.size());
        g.setColor(cor);
        g.drawPolygon(poligono);
        g.setColor(corInterna);
        g.fillPolygon(poligono);
    }

    public void limparPontos() {
        pontos.removeAll(pontos);
        pontos.clear();
    }
}
