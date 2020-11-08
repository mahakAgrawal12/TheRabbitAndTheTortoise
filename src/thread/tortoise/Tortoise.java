/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal (191500432)
 *  Date: 29/10/20
 *  Time: 04:20 PM
 *  File Name : Tortoise.java
 * */
package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {

    private static final int MILESTONES = 5;

    public Tortoise() {
        super("Tortoise");
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }

}
