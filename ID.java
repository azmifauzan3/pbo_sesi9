/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author  muhammad azmi fauzan
 */
package polymorfisme;

public class ID {
    public String nama = "Muhammad Azmi Fauzan";
    private final int nip = 123456789;
    public String jabatan = "manager";    
    
    public void nama(){
        System.out.println("Nama : "+nama);        
    }
    
    public void nip(){
        System.out.println("Nip : "+nip);
    }
    
    public void jabatan(){
        System.out.println("Jabatan : "+jabatan);
    }
}
