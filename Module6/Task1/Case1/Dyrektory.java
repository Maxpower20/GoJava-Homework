public class Dyrectory {
    public static void main(String[] args) {
        ArrayList<File> filesList = new ArrayList<File>();


        filesList.add(new Audio());
        filesList.add(new Text());
        filesList.add(new Image());

        try {
            filesList.add(5, new Image());
            } catch (IndexOutOfBoundsException e){
            System.out.println("Incorrect index declared for element");
        }



        int i = filesList.size();
        System.out.println("Number of elements stored in an ArrayList is: '" + i + "'");



    }
}
