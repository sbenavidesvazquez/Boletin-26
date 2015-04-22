/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin.pkg26;

/**
 *
 * @author sbenavidesvazquez
 */
public class Metodos {
    
    
    
    public boolean test(boolean k){
        k=true;
        return k;
    }
    
    public int cuentas(int cuent,boolean j){
        if(j=true)
            cuent++;
        return cuent;
    }
    
    public int aleatorio(){
        int random=(int) (Math.random()*48)+1;
        return random;
    }
    
}
