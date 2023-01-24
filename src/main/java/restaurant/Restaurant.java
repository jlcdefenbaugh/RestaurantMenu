package restaurant;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");



        Menu menu = new Menu();

        menu.addItem(item1);
    }
}
