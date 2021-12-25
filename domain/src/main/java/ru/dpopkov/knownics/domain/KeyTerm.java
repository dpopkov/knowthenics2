package ru.dpopkov.knownics.domain;

import ru.dpopkov.knownics.domain.user.AppUser;

public class KeyTerm extends ModifiableEntity {

    private String name;
    private String description;
    private AppUser createdBy;
    private AppUser modifiedBy;

    public KeyTerm() {
    }

    public KeyTerm(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public KeyTerm(String name, String description, AppUser createdBy, AppUser modifiedBy) {
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }

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
        return "KeyTerm{" +
                "name='" + name + '\'' +
                '}';
    }
}
