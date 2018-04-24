/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Random;
/**
 *
 * @author xszel
 */
public class Book {

    private int pagesNum;
    private String title;
    private String isbn;

    public Book(double price, int pagesNum) {
        this.setPrice(price);

        this.pagesNum = pagesNum;
    }

    public String toString() {
        return "Książka '" + getTitle() + "', ISBN: " + getIsbn();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNum() {
        return pagesNum;
    }

}
