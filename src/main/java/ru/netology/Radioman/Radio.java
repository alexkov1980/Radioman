package ru.netology.Radioman;

public class Radio {
    public int currentVolume;
    public int currentRadiostation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void next() {
        if (currentRadiostation < 9) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = 0;
        }
    }

    public void prev() {
        if (currentRadiostation > 0) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = 9;
        }
    }

    public void setCurrentRadiostation(int newCurrentRadiostation) {
        if (newCurrentRadiostation > 9) {
            return;
        }
        if (newCurrentRadiostation < 0) {
            return;
        }
        currentRadiostation = newCurrentRadiostation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
