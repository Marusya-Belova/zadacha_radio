package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void switchToNextStation() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;}
        else {
            this.currentStation = 0;
        }
    }

    public void switchToPrevStation() {
        if (this.currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation = this.currentStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (this.currentVolume >= 10) {
            this.currentVolume = 10;
        } else {
           this.currentVolume = this.currentVolume + 1;

        }
    }
    public void decreaseVolume() {
        if (this.currentVolume <= 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = this.currentVolume - 1;

        }
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

}