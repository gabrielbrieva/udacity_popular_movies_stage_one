package com.tuxan.udacity.popularmovies.model;

import java.util.Date;

/**
 * Movie model for deserialization from themoviedb API response
 */
public class Movie {

    public int id;
    public String poster_path;
    public String backdrop_path;
    public String original_title;
    public String overview;
    public String vote_average;
    public Date date;

}
