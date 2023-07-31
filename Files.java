package LabTwoPartTwo;

public class Files {

    private String name;

    private int sizeOfFile;

    private String type;

    public Files(String name, int sizeOfFile, String type) {
        setName(name);
        setSizeOfFile(sizeOfFile);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
        else throw new IllegalArgumentException("Введено имя файла null");

    }

    public int getSizeOfFile() {
        return sizeOfFile;
    }

    public void setSizeOfFile(int sizeOfFile) {
        if (sizeOfFile > 0) this.sizeOfFile = sizeOfFile;
        else throw new IllegalArgumentException("Введен некорректный размер файла");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) this.type = type;
        else throw new IllegalArgumentException("Введен тип файла null");
    }

    public static void printAll(Files[] files) {

        String specifiers = "%-45s    %5s   %10s   %5s    %-5s";

        System.out.println(".................................................................................................................................");

        System.out.format(specifiers, "                      File name", " | ", "Size", " | ", "Details");

        System.out.println("\n" + "---------------------------------------------------------------------------------------");


        for (Files file : files) {

            System.out.format(specifiers, file.getName(), " | ", file.getSizeOfFile(), " | ", file.getType() + ", " + ((file instanceof Documents) ? ((Documents) file).getPages() :

                    ((file instanceof Images) ? ((Images) file).getSizeOfPicture().toString() : ((file instanceof Multimedia) ? ((Multimedia) file).getDescription() + ", " + ((Multimedia) file).getDurationOfMultimedia().toString()

                            + ((file instanceof Videos) ? ", " + ((Videos) file).getSizeOfPicture().toString() : "") : ""))));

            System.out.println();



        }

        System.out.println(".................................................................................................................................");

    }



}
