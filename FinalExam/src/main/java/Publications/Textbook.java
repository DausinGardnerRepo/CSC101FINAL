/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Publications;

/**
 *
 * @author dausingardner
 */
public class Textbook extends Publication {
    private int numberChapters;
    
    public Textbook(String title, int totalPages, int numberChapters) {
        super(title, totalPages);
        this.numberChapters = numberChapters;
    }
    
    @Override
    public String toString(){
        return "This Textbook(" +super.getTitle() + ") contains " + numberChapters + 
                " chapters and " + super.getTotalPages() + " pages";
    }
    
    
}
