package LabTwoPartTwo;

public class Images extends Files {

    private SizeOfPictures sizeOfPicture;

    public Images(String name, int sizeOfFile, String type, SizeOfPictures sizeOfPicture) {
        super(name, sizeOfFile, type);
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
