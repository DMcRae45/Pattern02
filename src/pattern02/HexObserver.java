/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern02;

/**
 *
 * @author dmcra
 */
class HexObserver extends Observer {    // 2. Concrete class of the "dependent" 

    public HexObserver(Subject s) {    //    hierarchy
        subj = s;

    } // 4. Observers register themselves

    public void update() {
        System.out.print("  " + Integer.toHexString(subj.getState()));
    }
} // 6. Observers "pull" information 
