package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void sholudSetRadiostation() {
        Radio station = new Radio();
        station.setCurrentRadiostation(8);
        int expected = 8;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationNull() {
        Radio station = new Radio();
        station.setCurrentRadiostation(0);
        int expected = 0;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationUnderNull() {
        Radio station = new Radio();
        station.setCurrentRadiostation(-1);
        int expected = 0;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationAboveNine() {
        Radio station = new Radio();
        station.setCurrentRadiostation(10);
        int expected = 0;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationNine() {
        Radio station = new Radio();
        station.setCurrentRadiostation(9);
        int expected = 9;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadiostation() {
        Radio station = new Radio();
        station.setCurrentRadiostation(5);
        station.next();
        int expected = 6;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadiostationIfNine() {
        Radio station = new Radio();
        station.setCurrentRadiostation(9);
        station.next();
        int expected = 0;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrewRadiostation() {
        Radio station = new Radio();
        station.setCurrentRadiostation(4);
        station.prev();
        int expected = 3;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrewRadiostationIfNull() {
        Radio station = new Radio();
        station.setCurrentRadiostation(0);
        station.prev();
        int expected = 9;
        int actual = station.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(4);
        station.increaseVolume();
        int expected = 5;
        int actual = station.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveNull() {
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.increaseVolume();
        int expected = 10;
        int actual = station.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(7);
        station.decreaseVolume();
        int expected = 6;
        int actual = station.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfNull() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();
        int expected = 0;
        int actual = station.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldISetVolumeAboveTen() {
        Radio station = new Radio();
        station.setCurrentVolume(11);
        int expected = 0;
        int actual = station.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldISetVolumeUnderNull() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);
        int expected = 0;
        int actual = station.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
