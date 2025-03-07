package it.unibo.device;

public class DeviceImpl implements Device {
    private boolean isOn;

    public void on() throws IllegalStateException {
        if (isOn) {
            throw new IllegalStateException();
        }
        isOn = true;
    }

    public void off() {
        if (isOn) {
            throw new IllegalStateException();
        }
        isOn = false;
    }

    public boolean isOn() throws IllegalStateException {
        return isOn;
    }

    public void reset() throws IllegalStateException {
        isOn = false;
    }
}
