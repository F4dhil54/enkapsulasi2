/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author LENOVO
 */
public class TestSiswa {
       public static void main(String[] args) {
        // TODO code application logic here
    encapsiswa siswa = new encapsiswa();
    siswa.setName("Fadhil");
    siswa.setAge(16);
    siswa.setAddress("Malang");
    
        System.out.println("nama saya: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }
    
}



