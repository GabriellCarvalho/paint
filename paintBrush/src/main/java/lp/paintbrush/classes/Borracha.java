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
public class Borracha extends Ponto{
    
    private int base = 30;
    private int largura = 30;
    
    public void desenha(Graphics g) {
        g.setColor(cor);
        g.fillRect(x-15, y-15, base, largura);
        g.drawRect(x-15, y-15, base, largura);
    }
    
}
