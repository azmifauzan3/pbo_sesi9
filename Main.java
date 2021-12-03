*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi9;

/**
 *
 * @author  muhammad azmi fauzan
 */
import polymorfisme.JumlahGaji;


public class Main extends JumlahGaji {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(" Gaji Manager");
        System.out.println("-------------------------------------------");
        main.nip();
        main.nama();
        main.jabatan();
        main.gT();
        main.gaji();
        System.out.println("-------------------------------------------");
        System.out.println("Total Gaji Poko + Bonus : Rp. "+main.all()+",-");
        
    }

    private void nip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void nama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void jabatan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
