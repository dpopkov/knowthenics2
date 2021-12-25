package ru.dpopkov.knownics.domain.deck;

import ru.dpopkov.knownics.domain.ModifiableEntity;
import ru.dpopkov.knownics.domain.user.AppUser;

import java.util.HashSet;
import java.util.Set;

public class Deck extends ModifiableEntity {

    private String name;
    private String description;
    private AppUser owner;
    private Set<FlashCard> flashCards = new HashSet<>();
    private Set<StudySession> studySessions = new HashSet<>(); // collection of components

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppUser getOwner() {
        return owner;
    }

    public void setOwner(AppUser owner) {
        this.owner = owner;
    }

    public Set<FlashCard> getFlashCards() {
        return flashCards;
    }

    public void setFlashCards(Set<FlashCard> flashCards) {
        this.flashCards = flashCards;
    }

    public Set<StudySession> getStudySessions() {
        return studySessions;
    }

    public void setStudySessions(Set<StudySession> studySessions) {
        this.studySessions = studySessions;
    }

    public void addFlashCard(FlashCard flashCard) {
        flashCards.add(flashCard);
    }
}
