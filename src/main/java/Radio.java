public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public void nextStation(){
        if (currentRadioStation != 9) {
            currentRadioStation ++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation != 0) {
            currentRadioStation --;
        } else {
            currentRadioStation = 9;
        }
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }


    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 10) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }


    public void increaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        if (currentSoundVolume == 10) {
            currentSoundVolume = 10;
        }
    }

    public void volumeDown() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        if (currentSoundVolume == 0) {
            currentSoundVolume = 0;
        }
    }


}
