package ru.netology.Radioman;

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentRadiostation;
    private int minRadiostation = 0;
    private int maxRadiostation = 9;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void next() {
        if (currentRadiostation < maxRadiostation) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = minRadiostation;
        }
    }

    public void prev() {
        if (currentRadiostation > minRadiostation) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = maxRadiostation;
        }
    }

    public void setCurrentRadiostation(int newCurrentRadiostation) {
        if (newCurrentRadiostation > maxRadiostation) {
            return;
        }
        if (newCurrentRadiostation < minRadiostation) {
            return;
        }
        currentRadiostation = newCurrentRadiostation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
