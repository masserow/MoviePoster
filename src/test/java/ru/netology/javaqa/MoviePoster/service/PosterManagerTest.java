package ru.netology.javaqa.MoviePoster.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void testAdd() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMovie() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit() {
        PosterManager manager = new PosterManager(3);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");

        String[] expected = {"Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testVoidPoster() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


}