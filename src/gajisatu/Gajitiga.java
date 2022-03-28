/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajisatu;

/**
 *
 * @author LENOVO
 */
public class Gajitiga extends Gajidua {

    String nomor = "23423";
    String jeneng = "Agung";
    String jabatan = "Admin";

    public void skuy() {
        System.out.println("Berikut Identitas Pegawai: ");
        System.out.println("Nama:" + jeneng);
        System.out.println("Jenis Kelamin:" + super.gender);
        System.out.println("Nomor Pegawai:" + nomor);
        System.out.println("Bekerja di bagian " + jabatan);
        System.out.println("Gaji Utama:" + super.gaji);
    }
}
