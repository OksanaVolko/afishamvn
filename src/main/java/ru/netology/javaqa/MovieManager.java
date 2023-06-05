package ru.netology.javaqa;

public class MovieManager {

    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;

    }

    public MovieManager(int limit) {
        this.movies = new String[0];
        this.limit = limit;
    }

    public void addMovie(String movie) {

        String[] result = new String[movies.length + 1];
        for (int poster = 0; poster < movies.length; poster++) {
            result[poster] = movies[poster];
        }

        result[result.length - 1] = movie;
        movies = result;
    }

    public String[] findAll() {

        return movies;

    }


    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int poster = 0; poster < result.length; poster++) {
            result[poster] = movies[movies.length - 1 - poster];
        }
        return result;

    }

}

