/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Publications;

/**
 *
 * @author dausingardner
 */
public class Novel extends Publication {
    private String genre;
    
    public Novel(String title, int totalPages, String genre) {
        super(title, totalPages);
        this.genre = genre;
    }
    
    @Override
    public String toString(){
        return "This Novel(" +super.getTitle() + ") is a " + genre + 
                " text with " + super.getTotalPages() + " pages";
    }    
}
