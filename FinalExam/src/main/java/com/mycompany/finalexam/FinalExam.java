/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalexam;
import Publications.*;
/**
 *
 * @author dausingardner
 */
public class FinalExam {

    public static void main(String[] args) {
        Textbook textbookShelf[] = new Textbook[3]; 
        Novel novelBookShelf[] = new Novel[3];
        
        novelBookShelf[0] = new Novel("Good Book", 132, "Comedy");
        novelBookShelf[1] = new Novel("Bad Book", 112, "Science Fiction");
        novelBookShelf[2] = new Novel("Okay Book", 9002, "Informational");
        
        textbookShelf[0] = new Textbook("COM 101", 2003, 53);
        textbookShelf[1] = new Textbook("CSC 101", 749, 12);
        textbookShelf[2] = new Textbook("How To Not Get Caught 101", 829, 15);
       
        for(int i=0; i<3; i++){
            System.out.println(textbookShelf[i]);
        }
        
        for(int i=0; i<3; i++){
            System.out.println(novelBookShelf[i]);
        }
        
    }
}
