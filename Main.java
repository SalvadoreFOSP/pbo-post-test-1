/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

class Buku {
    
    public String judul;
    
    public Buku(String judul) {
        this.judul = judul;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Buku[] books = new Buku[5];
        
        books[0] = new Buku("Cosmos");
        books[1] = new Buku("Laut Bercerita");
        books[2] = new Buku("Sherlock Holmes");
        books[3] = new Buku("Hyouka");
        books[4] = new Buku("Godfather");
        
        // Menggunakan loop for untuk mencetak judul buku
        for (int i = 0; i < books.length; i++) {
            System.out.println("Buku " + (i + 1) + ": " + books[i].judul);
        }
    }
}
