package ru.netology.films;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shouldFindAllIfNoFilmsAdded() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllIf1FilmAdded() {
        FilmManager manager = new FilmManager();
        manager.add("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllIfAFewFilmsAdded() {
        FilmManager manager = new FilmManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsIfQuantityUnderLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsIfQuantityEqualsLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

   @Test
    public void shouldFindLastFilmsIfQuantityOverLimit() {
        FilmManager manager = new FilmManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");

        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
