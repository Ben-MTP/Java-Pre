package com.core.anno;

import java.time.LocalDateTime;

/**
 * @author ManhKM on 4/23/2022
 * @project java-annotation
 */
@JsonName(value = "super_man")
public class SuperMan extends Person{
    private String name;

    private LocalDateTime dateOfBirth;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
