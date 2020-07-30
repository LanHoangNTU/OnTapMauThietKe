/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.hoadonbuilder;

import java.text.ParseException;

/**
 *
 * @author Lân
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        HoaDon hoaDon = new HoaDon.Builder()
                .setHoaDonHeader(new HoaDonHeader("HD001", "22/11/2020", "Nguyen Dinh Hoang Lan"))
                .addArrCTHD(new CTHD("Ca phe sua", 2, 28000, 0))
                .addArrCTHD(new CTHD("Tra sua socola", 1, 35000, 0))
                .addArrCTHD(0, new CTHD("Ca phe den", 1, 14000, 0))
                .build();
        
        System.out.println(hoaDon.toString());
    }
    
}
