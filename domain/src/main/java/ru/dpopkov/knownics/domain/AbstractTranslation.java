package ru.dpopkov.knownics.domain;

import ru.dpopkov.knownics.domain.user.AppUser;

public class AbstractTranslation extends ModifiableComponent implements Translation {

    private Language language;
    private TextType type;
    private String text;
    private AppUser createdBy;
    private AppUser modifiedBy;

    public AbstractTranslation() {
    }

    public AbstractTranslation(Language language, TextType type, String text) {
        this.language = language;
        this.type = type;
        this.text = text;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setType(TextType type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Language getLanguage() {
        return language;
    }

    @Override
    public TextType getType() {
        return type;
    }

    @Override
    public String getText() {
        return text;
    }

    public AppUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(AppUser createdBy) {
        this.createdBy = createdBy;
    }

    public AppUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(AppUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "{" +
                "language=" + language +
                ", type=" + type +
                ", text='" + text + '\'' +
                '}';
    }
}