/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern02;

import java.util.Scanner;

/**
 *
 * @author dmcra
 */
public class ObserverDemo {

    public static void main(String[] args)
    {
        
        Scanner user_input = new Scanner(System.in);
        
        Subject sub = new Subject();
        // 7. Client configures the number and type of Observers
        HexObserver Hex = new HexObserver(sub);
        sub.attach(Hex);
        OctObserver Oct = new OctObserver(sub);
        sub.attach(Oct);
        BinObserver Bin = new BinObserver(sub);
        sub.attach(Bin);
        
        
        while (true) {
            System.out.print("\nEnter a number: ");
            
            sub.setState(Integer.parseInt(user_input.next()));
            
            
        }
    }
}
