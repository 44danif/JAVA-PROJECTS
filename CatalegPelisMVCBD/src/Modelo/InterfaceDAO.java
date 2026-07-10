/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author 44danif
 */
public interface InterfaceDAO {
    
    public boolean addPeli(Pelicula anyadir);
    public List<Pelicula> allPelis();
    public List<Pelicula> AllPelisSecondPart(boolean segunda);
    public boolean borrarPelicula(Pelicula fakeDelete) ;
    public Pelicula findPeli(Pelicula fakeSearch) throws InvalidIdPeliculaException;
    public List<Pelicula> findPelisGenero(String generoSearch) ;
    public List<Pelicula> findPelisGenero2(Pelicula generoSearch);
    public int borrarPeliculasNombre(String tituloDelete);
}
