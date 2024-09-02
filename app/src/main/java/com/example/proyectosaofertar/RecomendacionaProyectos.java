    package com.example.proyectosaofertar;

    import java.util.ArrayList;
    import java.util.List;

    public class RecomendacionaProyectos {
        public List<String> getBrands(String color) {
            List<String> brands = new ArrayList<>();

            switch (color) { // Eliminamos el .toLowerCase() para que coincida con las cadenas originales
                case "infraestructura ":
                    brands.add("parques");
                    brands.add("zonas verdes");
                    break;
                case "recreación ":
                    brands.add("ciclovías");
                    brands.add("parques");
                    break;
                case "Diseño Web":
                    brands.add("Tiendas en línea\n");
                    brands.add("Blogs personales\n");
                    break;
                case "Proyectos de Ingeniería":
                    brands.add("automatización industrial");
                    brands.add(" productos electrónicos");
                    break;
                default:
                    brands.add("No hay recomendacion valida para esta profesion");
                    break;
            }

            return brands;
        }
    }
    