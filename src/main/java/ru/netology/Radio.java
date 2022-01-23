package ru.netology;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int minCurrentStation = 0;
    private int countStation = 10;
    private int maxCurrentStation = countStation - 1;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public Radio() {
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minCurrentStation) {
            return;
        }
        if (currentStation > countStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void switchToNextStation() {
        if (currentStation < countStation - 1) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minCurrentStation;
        }
    }

    public void switchToPrevStation() {
        if (this.currentStation == minCurrentStation) {
            this.currentStation = countStation - 1;
        } else {
            this.currentStation = this.currentStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minCurrentVolume) {
            this.currentVolume = minCurrentVolume;
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            this.currentVolume = maxCurrentVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (this.currentVolume >= maxCurrentVolume) {
            this.currentVolume = maxCurrentVolume;
        } else {
            this.currentVolume = this.currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (this.currentVolume <= minCurrentVolume) {
            this.currentVolume = minCurrentVolume;
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

    public int getCountStation() {
        return countStation;
    }

    public void setMinCurrentStation(int minCurrentStation) {
        this.minCurrentStation = minCurrentStation;
    }

    public void setMaxCurrentStation(int maxCurrentStation) {
        this.maxCurrentStation = maxCurrentStation;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public int getMinCurrentStation() {
        return minCurrentStation;
    }

    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }
}