/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.hoadonbuilder;

import java.util.ArrayList;

/**
 *
 * @author Lân
 */
public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private ArrayList<CTHD> arrCTHD;

    private HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.arrCTHD = builder.arrCTHD;
    }
    
    private String cthdToString(){
        StringBuilder b = new StringBuilder();
        arrCTHD.forEach(cthd -> {
            b.append("\n").append(cthd.toString());
        });
        return b.toString();
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder(hoaDonHeader.toString());
        b.append(this.cthdToString());
        return b.toString();
    }
    
    public static class Builder{
        private HoaDonHeader hoaDonHeader;
        private ArrayList<CTHD> arrCTHD;

        public Builder() {
            this.hoaDonHeader = new HoaDonHeader();
            this.arrCTHD = new ArrayList<>();
        }

        public Builder setHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder addArrCTHD(CTHD cthd) {
            this.arrCTHD.add(cthd);
            return this;
        }
        
        public Builder addArrCTHD(int i, CTHD cthd) {
            if(this.arrCTHD.get(i) != null)
                this.arrCTHD.add(i, cthd);
            else
                this.arrCTHD.add(cthd);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
