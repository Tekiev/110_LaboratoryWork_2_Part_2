package LabTwoPartTwo;

public class Videos extends Multimedia {

    private SizeOfPictures sizeOfPicture;

    public Videos(String name, int sizeOfFile, String type, String description, DurationOfMultimedia durationOfMultimedia, SizeOfPictures sizeOfPicture) {
        super(name, sizeOfFile, type, description, durationOfMultimedia);
        setSizeOfPicture(sizeOfPicture);

    }

    public SizeOfPictures getSizeOfPicture() {
        return sizeOfPicture;
    }

    public void setSizeOfPicture(SizeOfPictures sizeOfPicture) {
        if (sizeOfPicture != null) this.sizeOfPicture = sizeOfPicture;
        else throw new IllegalArgumentException ("Введен размер изображения null");
    }



}
