/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 44danif
 */
public class InvalidIdPeliculaException extends Exception{

    public InvalidIdPeliculaException() {
        super("Id peli debe ser positiva");
    }
    
    
}
