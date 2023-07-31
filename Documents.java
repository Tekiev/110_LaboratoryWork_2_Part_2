package LabTwoPartTwo;

public class Documents extends Files {

    private int pages;

    public Documents(String name, int sizeOfFile, String type, int pages) {
        super(name, sizeOfFile, type);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) this.pages = pages;
        else throw new IllegalArgumentException ("Введено некорректное число страниц");

    }


}
