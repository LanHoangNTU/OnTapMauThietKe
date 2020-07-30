/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.caythumuc;

/**
 *
 * @author Lân
 */
public class CompositePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ininitialize folders
        AbstractFile root = new Folder("Data");
        AbstractFile toan = new Folder("Toan");
        AbstractFile ly = new Folder("Ly");
        AbstractFile hoa = new Folder("Hoa");
        AbstractFile giaiTich = new Folder("GiaiTich");
        AbstractFile daiSo = new Folder("DaiSo");
        
        // Ininitialize files
        AbstractFile toanA = new File("ToanA.pdf");
        AbstractFile daiSoTT = new File("DaiSoTT.pdf");
        AbstractFile coHoc = new File("CoHoc.pdf");
        AbstractFile quangHoc = new File("QuangHoc.pdf");
        AbstractFile dssv = new File("DanhSachSinhVien.xlsx");
        
        //
        root.add(toan);
        root.add(ly);
        root.add(hoa);
        root.add(dssv);
        
        toan.add(giaiTich);
        toan.add(daiSo);
        
        giaiTich.add(toanA);
        daiSo.add(daiSoTT);
        
        ly.add(coHoc);
        ly.add(quangHoc);        
        
        System.out.println(root.getTreeFolder(""));
        System.out.println(daiSoTT.getPath());
    }
    
}
