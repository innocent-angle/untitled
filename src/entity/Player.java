package entity;

import main.GamePanel;
import main.KeyInputManager;

import java.awt.*;

public class Player extends Entity {
    GamePanel gp;
    KeyInputManager inputManager;

    public Player (GamePanel gp, KeyInputManager inputManager) {
        this.gp = gp;
        this.inputManager = inputManager;
        setDefaultValues();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
    }

    public void update() {
        if (inputManager.upPressed) {
            y -= speed;
        }

        if (inputManager.downPressed) {
            y += speed;
        }

        if (inputManager.leftPressed) {
            x -= speed;
        }

        if (inputManager.rightPressed) {
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
