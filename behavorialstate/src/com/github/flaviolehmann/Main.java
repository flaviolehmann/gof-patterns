package com.github.flaviolehmann;

import com.github.flaviolehmann.domain.Player;

public class Main {

    public static void main(String ...args) {
        new Main().main();
    }

    public void main() {
        Player player = new Player("Flavio");

        // This will put Player in FullLife state
        player.setLife(100L);
        player.logStatus();

        // This will change it to normal life state
        player.setLife(75L);
        player.logStatus();

        // And this will switch it to dangerously low life state
        player.setLife(5L);
        player.logStatus();
    }
}
