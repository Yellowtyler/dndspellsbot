package com.example.dndspellsbot.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Spell {

    private String _id;
    private String index;
    private String name;
    private String[] desc;
    private String [] higher_level;
    private String page;
    private String range;
    private String[] components;
    private Boolean ritual;
    private String material;
    private String duration;
    private Boolean concentration;
    private String casting_time;
    private Integer level;
    @JsonProperty
    private School school;
    @JsonProperty
    private Classes[] classes;
    @JsonProperty
    private Subclasses[] subclasses;
    private String url;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    public String[] getHigher_level() {
        return higher_level;
    }

    public void setHigher_level(String[] higher_level) {
        this.higher_level = higher_level;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String[] getComponents() {
        return components;
    }

    public void setComponents(String[] components) {
        this.components = components;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Boolean getRitual() {
        return ritual;
    }

    public void setRitual(Boolean ritual) {
        this.ritual = ritual;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getConcentration() {
        return concentration;
    }

    public void setConcentration(Boolean concentration) {
        this.concentration = concentration;
    }

    public String getCasting_time() {
        return casting_time;
    }

    public void setCasting_time(String casting_time) {
        this.casting_time = casting_time;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Classes[] getClasses() {
        return classes;
    }

    public void setClasses(Classes[] classes) {
        this.classes = classes;
    }

    public Subclasses[] getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(Subclasses[] subclasses) {
        this.subclasses = subclasses;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
