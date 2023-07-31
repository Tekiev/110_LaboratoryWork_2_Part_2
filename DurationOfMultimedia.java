package LabTwoPartTwo;

public class DurationOfMultimedia {

    private int hours;

    private int minutes;

    private int seconds;

    public DurationOfMultimedia(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public DurationOfMultimedia(int minutes, int seconds) {
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 0) this.hours = hours;
        else throw new IllegalArgumentException ("Введена некорректная длительность файла");
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 0 && minutes < 60) this.minutes = minutes;
        else throw new IllegalArgumentException ("Введена некорректная длительность файла");

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 0 && seconds < 60) this.seconds = seconds;
        else throw new IllegalArgumentException ("Введена некорректная длительность файла");
    }

    @Override
    public String toString() {
        if (hours != 0) return hours + ":" + minutes + ":" + seconds;
        else return  minutes + ":" + seconds;
    }
}
