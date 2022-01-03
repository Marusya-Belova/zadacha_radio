package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStationLessThan0Test() {
        Radio radio = new Radio();
        radio.setCurrentStation(-3);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationGreaterThan9Test() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationBetweenLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchToNextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.switchToNextStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void switchToNextStationforstation9Test() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchToNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.switchToPrevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void switchToPrevStationforstation0Test() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchToPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeGreaterThan10TestTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolumeLessThan0Test() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolumeBetweenLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeBetweenLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeGreaterThan10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolumeLessThan0Test() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}