package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

        private ArrayList<MenuItem> menuItems = new ArrayList<>();
        private Date lastUpdated;


        public ArrayList<MenuItem> getMenuItems() {
                return menuItems;
        }

        @Override
        public String toString() {
                System.out.println("TONY'S PIZZA MENU");
                System.out.println("\nAPPETIZERS\n");
                for (MenuItem item : menuItems) {
                        if (item.getCategory().equals("appetizer")) {
                                System.out.println(item);
                        }
                }
        }



        void addItem(MenuItem item) {
                menuItems.add(item);
                lastUpdated = new Date();
        }

        void removeItem(MenuItem item) {
                menuItems.remove(item);
                lastUpdated = new Date();
        }
}
