package com.hand;

public abstract class IdEntity {
    protected Long id;

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
