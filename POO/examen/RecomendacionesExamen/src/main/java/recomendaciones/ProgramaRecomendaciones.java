package recomendaciones;

import java.util.ArrayList;
import java.util.List;

class ProgramaRecomendaciones extends Recomendacion {
    private List<CategoriaRecomendaciones> categorias;

    public ProgramaRecomendaciones() {
        super();
        categorias = new ArrayList<>();
    }

    public void agregarCategoria(String nombreCategoria) {
        categorias.add(new CategoriaRecomendaciones(nombreCategoria));
    }

    public void agregarRecomendacion(String nombreCategoria, Recomendacion recomendacion) {
        for (CategoriaRecomendaciones categoria : categorias) {
            if (categoria.getNombre().equals(nombreCategoria)) {
                categoria.agregarRecomendacion(recomendacion);
                return;
            }
        }
    }

    public void darLike(String nombreCategoria, String nombreRecomendacion) {
        for (CategoriaRecomendaciones categoria : categorias) {
            if (categoria.getNombre().equals(nombreCategoria)) {
                for (Recomendacion recomendacion : categoria.getRecomendaciones()) {
                    if (recomendacion.getNombre().equals(nombreRecomendacion)) {
                        recomendacion.darLike();
                        return;
                    }
                }
            }
        }
    }

    public void agregarComentario(String nombreCategoria, String nombreRecomendacion, String comentario) {
        for (CategoriaRecomendaciones categoria : categorias) {
            if (categoria.getNombre().equals(nombreCategoria)) {
                for (Recomendacion recomendacion : categoria.getRecomendaciones()) {
                    if (recomendacion.getNombre().equals(nombreRecomendacion)) {
                        recomendacion.agregarComentario(comentario);
                        return;
                    }
                }
            }
        }
    }

    private class CategoriaRecomendaciones {
        public CategoriaRecomendaciones(String nombreCategoria) {
        }

        public Object getNombre() {
            return new Object();
        }

        public Recomendacion[] getRecomendaciones() {
            return new Recomendacion[0];
        }

        public void agregarRecomendacion(Recomendacion recomendacion) {
        }
    }


}

