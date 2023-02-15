import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testTheRadioStationValueIsWithinTheRequirement() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheNumberOfTheRadioStationIsGreaterThanTheLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(12);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheRadioStationNumberIsLessThanTheLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-8);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheBoundaryValueWhenLessThanTheLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheBoundaryValueWhenIsEqualToTheMinimumLimitOfTheLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheBoundaryValueWhenIsEqualToOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheBoundaryValueWhenIsEqualToEight() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheBoundaryValueWhenIsEqualToNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheBoundaryValueWhenIsEqualToTen() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchingToTheNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToTheNextStationFromNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToTheNextStationFromZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToTheNextStationFromOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToTheNextStationFromEight() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToTheNextStationFromNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToTheNextStationFromTenth() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchingToThePreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToThePreviousStationFromTheFirst() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToThePreviousStationFromTheNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToThePreviousStationFromTheZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToThePreviousStationFromTheNinth() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToThePreviousStationFromTheEight() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundarySwitchingToThePreviousStationFromTheTenth() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheVolumeOfTheRadioStationIsWithinTheRequiredRange() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(6);

        int expected = 6;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLimitsWithinTheLimitNegativeValue() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLimitsWithinTheLimitZeroValue() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLimitsWithinTheUnitLimit() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(1);

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLimitsWithinTheHundredLimit() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitsExceedingTheVolumeLimit() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheLimitsOfTheVolumeLimitAreHundred() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheLimitsOfTheVolumeLimitAreNinetyNine() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(99);

        int expected = 99;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(98);

        radio.increaseVolume();

        int expected = 99;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOneLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOneLimitValueOfHundred() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOneLimitValueIsGreaterThanHundred() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(101);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeReductionByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(98);

        radio.volumeDown();

        int expected = 97;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValuesOfVolumeReductionFromNegativeValue() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValuesOfVolumeReductionWithZeroValue() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValuesOfVolumeReductionByValueOfOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSettingTheStationParameter() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(14);

        int expected = 14;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}