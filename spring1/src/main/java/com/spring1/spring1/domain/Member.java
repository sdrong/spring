package com.spring1.spring1.domain;

public class Member {
    private Long id;
    private String name;
    public Long get_id(){
        return id;
    }
    public void set_id(Long id){
        this.id = id;
    }
    public String get_name() {
        return name;
    }
    public void set_name(String name){
        this.name = name;
    }
}
