package com.careerdevs.gorestfinal.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

}
