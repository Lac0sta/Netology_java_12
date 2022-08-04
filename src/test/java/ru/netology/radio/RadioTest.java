package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void maySetRadioStation() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangeNextRadioStation() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioStation(8);

        radio.changeRadioStationNext();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationFromUpperToLower() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioStation(9);

        radio.changeRadioStationNext();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangePrevRadioStation() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioStation(1);

        radio.changeRadioStationPrev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchRadioStationFromLowerToUpper() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioStation(0);

        radio.changeRadioStationPrev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioStationOverMax() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioStationLowerMin() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maySetRadioVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();

        radio.setCurrentRadioVolume(5);

        int expected = 5;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangeRadioVolumePlus() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioVolume(9);

        radio.changeRadioVolumePlus();

        int expected = 10;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSwitchRadioVolumeFromUpperToLower() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioVolume(10);

        radio.changeRadioVolumePlus();

        int expected = 10;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayChangeRadioVolumeMinus() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioVolume(1);

        radio.changeRadioVolumeMinus();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSwitchRadioVolumeFromLowerToUpper() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentRadioVolume(0);

        radio.changeRadioVolumeMinus();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioVolumeOverMax() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();

        radio.setCurrentRadioVolume(11);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mayNotSetRadioVolumeLowerMin() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }
}
