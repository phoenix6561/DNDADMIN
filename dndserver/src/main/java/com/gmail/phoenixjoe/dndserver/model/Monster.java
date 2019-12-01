package com.gmail.phoenixjoe.dndserver.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "monsters")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Monster extends PropertyMap{

}
