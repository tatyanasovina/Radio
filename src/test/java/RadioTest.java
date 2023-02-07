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
    public void testVolumeLimitsWithinTheTenLimit() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitsExceedingTheVolumeLimit() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(11);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheLimitsOfTheVolumeLimitAreTen() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTheLimitsOfTheVolumeLimitAreNine() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(9);

        int expected = 9;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOneLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOneLimitValueOfTen() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseTheVolumeByOneLimitValueIsGreaterThanTen() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(11);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeReductionByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(8);

        radio.volumeDown();

        int expected = 7;
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


}
