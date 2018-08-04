/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rna.transcription;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alwandy
 */
public class RnaTranscription implements RnaTranscriptionInterface{
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        RnaTranscription view = new RnaTranscription();
        RnaTranscriptionPresenter presenter = new RnaTranscriptionPresenter(view);
        
        System.out.println("Sample Input");
        Scanner scan = new Scanner(System.in);
        
        int count = scan.nextInt();
        
        for(int i=0; i < count; i++) {
            String input = scan.next();
            list.add(input);
        }
        
        System.out.println("\n\nExpected Output");
        presenter.checkRNA(list);
    }    

    @Override
    public void printRnaTranscription(String result) {
        System.out.println(result);
    }
}
