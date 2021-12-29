package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
   public void setCurrentStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected =0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }

    @Test
    public void switchToNextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchToNextStation();
        int expected =0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }

 @Test
    public void switchToPrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchToPrevStation();
        int expected =9;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }

    @Test
  public   void setCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        int expected =0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected =8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual); }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected =0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
}