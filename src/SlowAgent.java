import processing.core.PApplet;

public class SlowAgent implements Agent{
    private final PApplet p5;
    private float size;
    private float x;
    private float y;
    private final float velocity;
    private int myColour;

    public SlowAgent(PApplet p5, float x, float y, float size) {
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.size = size;
        this.velocity = 2.0f;
        this.myColour = p5.color(255, 255, 0);
    }

    public void display() {
        p5.fill(myColour);
        p5.circle(x, y, size);
    }

    public void update() {
        x += p5.random(-velocity, velocity);
        y += p5.random(-velocity, velocity);
        size = PApplet.constrain(size + p5.random(-1, 1), 5, 100);
    }
}