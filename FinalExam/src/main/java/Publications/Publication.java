/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Publications;

/**
 *
 * @author dausingardner
 */
public class Publication {
    private String title;
    private int totalPages;
    
    public Publication(String title, int totalPages){
        this.title = title;
        this.totalPages = totalPages;
    }
    
    protected String getTitle(){
        return this.title;
    }
    
    protected int getTotalPages(){
        return this.totalPages;
    }
    
    public String toString(){
        return "This publication("+ title +") contains " + totalPages + " pages";
    }
}

