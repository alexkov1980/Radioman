package ru.netology.Radioman;

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentRadiostation;
    private int minRadiostation = 0;
    private int numberRadiostation = 10;

    public Radio() {

    }

    public Radio(int numberRadiostation) {
        this.numberRadiostation = numberRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void next() {
        if (currentRadiostation < numberRadiostation - 1) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = minRadiostation;
        }
    }

    public void prev() {
        if (currentRadiostation > minRadiostation) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = numberRadiostation - 1;
        }
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation > numberRadiostation - 1) {
            return;
        }
        if (currentRadiostation < minRadiostation) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
