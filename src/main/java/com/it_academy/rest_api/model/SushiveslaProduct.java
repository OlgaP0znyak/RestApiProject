package com.it_academy.rest_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SushiveslaProduct {
    private int id;
    private String key;
    private String name;
    private String full_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SushiveslaProduct that = (SushiveslaProduct) o;
        return id == that.id && key.equals(that.key) && name.equals(that.name) && full_name.equals(that.full_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, name, full_name);
    }

    @Override
    public String toString() {
        return "SushiveslaProduct{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                '}';
    }
}
