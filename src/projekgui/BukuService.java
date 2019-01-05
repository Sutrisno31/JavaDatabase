/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekgui;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class BukuService extends Buku implements InterfaceBuku{
    ArrayList<Buku> listBuku = new ArrayList<>();
    DefaultTableModel dtm = new DefaultTableModel();
    
    @Override
    public void create(Buku b) {
        listBuku.add(b);
    }

    @Override
    public void read(JTable table) {
        String [] header = {"Kode Buku","Judul Buku","Genre","Harga"};
        dtm = new DefaultTableModel(null,header);
        for (int i = 0; i < listBuku.size(); i++) {
            Object [] o = new Object[4];
            o[0] = listBuku.get(i).getKodeBuku();
            o[1] = listBuku.get(i).getNamaBuku();
            o[2] = listBuku.get(i).getGenre();
            o[3] = listBuku.get(i).getHarga();
            dtm.addRow(o);
        }
        table.setModel(dtm);
    }

    @Override
    public void update(Buku b, int id) {
        listBuku.set(id, b);
    }

    @Override
    public void delete(int id) {
        listBuku.remove(id);
    }

    
    
}
