package org.example;

import java.util.List;

public class Memoire implements Document {
    private String titre;
    private List<Chapitre> chapitres;

    public Memoire(String titre, List<Chapitre> chapitres) {
        this.titre = titre;
        this.chapitres = chapitres;
    }

    @Override
    public String titre() {
        return this.titre;
    }

    @Override
    public int taille() {

        return chapitres.stream().mapToInt(Chapitre::taille).sum();
    }

    public List<Chapitre> getChapitres() {
        return chapitres;
    }
}

