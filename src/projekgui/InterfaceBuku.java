/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekgui;

import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public interface InterfaceBuku {
   public void create(Buku b); 
   public void read(JTable table);
   public void update(Buku b, int id);
   public void delete(int id);
}
