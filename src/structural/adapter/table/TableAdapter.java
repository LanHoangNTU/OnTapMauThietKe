/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.adapter.table;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lân
 */
public class TableAdapter {
    public TableModel listAdapter(ArrayList<SinhVien> list){
        DefaultTableModel tableModel = null;
        Vector data = new Vector();
        Vector header = new Vector();
        for (SinhVien item : list) {
            Vector row = new Vector();
            row.add(item.getName());
            row.add(item.getBorn());
            row.add(item.getDateOfBirth());
            data.add(row);
        }
        header.add("Name");
        header.add("Home town");
        header.add("Date of birth");
        tableModel = new DefaultTableModel(data, header);
        return tableModel;
    }
}
