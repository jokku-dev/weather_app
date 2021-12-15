package com.vikche.study;

public final class MainPresenter {
    private static MainPresenter instance = null;
    private static final Object SYNC_OBJ = new Object();
    private String cityNameInput;
    private boolean isWindBoxChecked;
    private boolean isPressureBoxChecked;

    private MainPresenter() {
    }

    public String getCityNameInput() {
        return cityNameInput;
    }

    public void setCityNameInput(String cityNameInput) {
        this.cityNameInput = cityNameInput;
    }

    public boolean isWindBoxChecked() {
        return isWindBoxChecked;
    }

    public void setWindBoxChecked(boolean windBoxChecked) {
        isWindBoxChecked = windBoxChecked;
    }

    public boolean isPressureBoxChecked() {
        return isPressureBoxChecked;
    }

    public void setPressureBoxChecked(boolean pressureBoxChecked) {
        isPressureBoxChecked = pressureBoxChecked;
    }

    public static MainPresenter getInstance() {
        synchronized (SYNC_OBJ) {
            if (instance == null) {
                instance = new MainPresenter();
            }
            return instance;
        }
    }
}