
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joeva
 */
public class Wizard {
    public static ArrayList<String> reverse(String[] wizards) throws Exception{
        ArrayList<String> reverse = new ArrayList<String>();
        for (int i = wizards.length - 1; i >= 0; i--){
            reverse.add(wizards[i]);
        }
        return reverse;
    }
    public static void main(String[] args) throws Exception{
	try {
        String[] array = {"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"};
        ArrayList<String> reversed = reverse(array);
        System.out.println(reversed);
    } catch (Exception ex) {
            Logger.getLogger(Wizard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

