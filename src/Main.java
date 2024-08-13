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
        agents = createAgents(this, 100);
    }


    @Override
    public void draw() {
    background(100);
        for (Agent a : agents){
            a.display();
        }

        for (Agent a : agents){
            a.update();
        }
    }
}