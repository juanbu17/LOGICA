package recomendaciones;

public class Main {
    public static void main(String[] args) {
        ProgramaRecomendaciones programa = new ProgramaRecomendaciones();

        programa.agregarCategoria("Libros");
        programa.agregarCategoria("Películas");
        programa.agregarCategoria("Canciones");
        programa.agregarCategoria("Artículos");

        Recomendacion libro = new Recomendacion("Libro A", "Autor 1", "Sinopsis del libro A");
        Recomendacion pelicula = new Recomendacion("Película B", "Director 2", "Sinopsis de la película B");
        Recomendacion cancion = new Recomendacion("Canción C", "Artista 3", "Sinopsis de la canción C");
        Recomendacion articulo = new Recomendacion("Artículo D", "Autor 4", "Sinopsis del artículo D");

        programa.agregarRecomendacion("Libros", libro);
        programa.agregarRecomendacion("Películas", pelicula);
        programa.agregarRecomendacion("Canciones", cancion);
        programa.agregarRecomendacion("Artículos", articulo);

        programa.darLike("Libros", "Libro A");
        programa.agregarComentario("Libros", "Libro A", "Me encantó este libro!");


    }
}