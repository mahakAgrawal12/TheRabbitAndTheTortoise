/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal (191500432)
 *  Date: 29/10/20
 *  Time: 04:21 PM
 *  File Name : Race.java
 * */
package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.start();
    }
}
