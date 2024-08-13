import processing.core.PApplet;

public class Main extends PApplet {
    Agent[] agents;

    public static void main(String[] args) {
        PApplet.main(new String[]{"Main"});
    }

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        agents = createAgents(this);
    }


    @Override
    public void draw() {
        background(100);
        for (Agent a : agents) {
            a.display();
        }

        for (Agent a : agents) {
            a.update();
        }
    }

    private Agent[] createAgents(PApplet p5) {
        agents = new Agent[100];
        for (int i = 0; i < 100; i++) {
            if (p5.random(1) > 0.5) {
                agents[i] = createFastAgent(p5);
            } else {
                agents[i] = createSlowAgent(p5);
            }
        }
        return agents;
    }

    private Agent createFastAgent(PApplet p5) {
        float x = random(0f, 800f);
        float y = random(0f, 600f);
        float size = 30;

        return new FastAgent(p5, x, y, size);
    }

    private Agent createSlowAgent(PApplet p5) {
        float x = random(0f, 800f);
        float y = random(0f, 600f);
        float size = 60;

        return new SlowAgent(p5, x, y, size);
    }

}
