package com.abate.rest.webservice.model;

import java.time.LocalDate;
import java.util.UUID;


public class Users {
    private int id;
    private String  uuid;
    private String name;
    private LocalDate birthDate;

    public Users(int id, String name, LocalDate birthDate, String uuid) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
