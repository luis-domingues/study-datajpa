package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    DRAMA("Drama", "Drama"),
    TERROR("Horror", "Terror"),
    SUSPENSE("Thriller", "Suspense"),
    AVENTURA("Adventure", "Aventura"),
    ANIMATION("Animation", "Animação"),
    ROMANCE("Romance", "Ramance"),
    CURTO("Short", "Curta"),
    HISTORIA("History", "História"),
    MISTERIO("Mystery", "Mistério"),
    COMEDIA("Comedy", "Comédia"),
    CRIME("Crime", "Crime");

    private String categoriaOmdb;
    private String categoriaPortugues;

    Categoria(String categoriaOmdb, String categoriaPortugues) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
