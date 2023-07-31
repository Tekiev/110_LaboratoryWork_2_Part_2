package LabTwoPartTwo;

public class Multimedia extends Files {

    private String description;

    private DurationOfMultimedia durationOfMultimedia;

    public Multimedia(String name, int sizeOfFile, String type, String description, DurationOfMultimedia durationOfMultimedia) {
        super(name, sizeOfFile, type);
        setDescription(description);
        setDurationOfMultimedia(durationOfMultimedia);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null) this.description = description;
        else throw new IllegalArgumentException ("Введено описание файла null");
    }

    public DurationOfMultimedia getDurationOfMultimedia() {
        return durationOfMultimedia;
    }

    public void setDurationOfMultimedia(DurationOfMultimedia durationOfMultimedia) {
        if (durationOfMultimedia != null) this.durationOfMultimedia = durationOfMultimedia;
        else throw new IllegalArgumentException ("Введена длительность изображения null");
    }
}
