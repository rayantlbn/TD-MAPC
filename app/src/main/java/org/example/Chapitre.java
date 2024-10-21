package org.example;

import java.util.List;

public class Chapitre implements Document {
    private String titre;
    private List<String> pages;

    public Chapitre(String titre, List<String> pages) {
        this.titre = titre;
        this.pages = pages;
    }

    @Override
    public String titre() {
        return this.titre;
    }

    @Override
    public int taille() {
        // La taille d'un chapitre correspond au nombre de pages
        return pages.size();
    }

    public List<String> getPages() {
        return pages;
    }
}
