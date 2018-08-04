/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rna.transcription;

import java.util.List;

/**
 *
 * @author alwandy
 */
public class RnaTranscriptionPresenter {
    
    private RnaTranscription view;
    
    RnaTranscriptionPresenter(RnaTranscription view) {
        this.view = view;
    }
    
//    public void checkInput(String input) {
//        if(input.matches(".*\\d+.*")){
//            
//        }
//    }
    
    public void checkRNA(List<String> rna){
        for(int i = 0; i < rna.size(); i ++){
            String result = "";
            
            for(char rna1 : rna.get(i).toCharArray()){
                result = changeRNA(result, rna1);
            }
            
            view.printRnaTranscription(result);
        }
    }
    
    public String changeRNA(String result, char charAt) {
        
        switch(charAt){
            case 'G':
                result += "C";
                break;
            case 'C' :
                result += "G";
                break;
            case 'T' :
                result += "A";
                break;
            case 'A' :
                result += "U";
                break;
        }
        
        return result;
    }
    
}
