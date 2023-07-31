package LabTwoPartTwo;

public class SizeOfPictures {

    private int width;

    private int height;

    public SizeOfPictures(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) this.width = width;
        else throw new IllegalArgumentException ("Введена некорректная ширина изображения");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) this.height = height;
        else throw new IllegalArgumentException ("Введена некорректная высота изображения");
    }

    @Override
    public String toString() {
        return (width + "x" + height);
    }
}
