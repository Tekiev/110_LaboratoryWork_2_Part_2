package LabTwoPartTwo;

public class Main {

    public static void main(String[] args) {

        try {

            Files[] files = new Files[]{

                    new Documents("j110-lab2-hiers.docx", 23212, "docx", 2),

                    new Images("spb-map.png", 1703527, "image", new SizeOfPictures(1024, 3072)),

                    new Multimedia("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", new DurationOfMultimedia(5, 28)),

                    new Videos("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", new DurationOfMultimedia(1, 48, 8), new SizeOfPictures(640, 352))};

            Files.printAll(files);

            System.out.println();




            Documents[] documents = new Documents[]{

                    new Documents("C/C++. Процедурное программирование.pdf", 232120, "pdf", 980),

                    new Documents("Java. Полное руководство, 10-е издание.doc", 2321, "doc", 1200)};

            Files.printAll(documents);  ////   из за того, что классы Documents, Images, Multimedia, Videos наследуются от класса Files, применяется принцип полиморфизма и метод printAll(Files[] files) может принимать в качестве аргумента любые наследуемые от Files классы.

            System.out.println();




            Images[] images = new Images[]{

                    new Images("msk.jpg", 17035270, "image", new SizeOfPictures(2048, 3072)),

                    new Images("spb-map.png", 1703527, "image", new SizeOfPictures(1024, 3072))};

            Files.printAll(images);

            System.out.println();





            Multimedia[] multimedia = new Multimedia[]{

                    new Multimedia("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", new DurationOfMultimedia(5, 28)),

                    new Multimedia("07-UglyGirl.mp3", 7893454, "audio", "Eric Clapton, Ugly Girl", new DurationOfMultimedia(1, 10))};

            Files.printAll(multimedia);


            System.out.println();




            Videos[] videos = new Videos[]{

                    new Videos("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", new DurationOfMultimedia(1, 48, 8), new SizeOfPictures(640, 352)),

                    new Videos("BackToTheFuture2.mkv", 1470984192, "video", "Back to the future II, 1985", new DurationOfMultimedia(1, 58, 8), new SizeOfPictures(1024, 352))};

            Files.printAll(videos);



        } catch (IllegalArgumentException e) {

            System.out.println(e);


        }


    }

}
