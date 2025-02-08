/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author ADMIN
 */
public class HTS implements Comparable<HTS>{
    private String msv, name,cl,gmail,sdt;

    public HTS(String msv, String name, String cl, String gmail, String sdt) {
        this.msv = msv;
        this.name = name;
        this.cl = cl;
        this.gmail = gmail;
        this.sdt = '0' + sdt;
    }
    @Override
    public int compareTo(HTS b){
        if(this.cl.equals(b.cl)) return this.msv.compareTo(b.msv);
        return this.cl.compareTo(b.cl);
    }
    public void output(){
        System.out.println(msv+" "+name+" "+cl+" "+gmail+" "+sdt);
    }
}
