package u3;

public class App {
    public static void main(String[] args) {
        System.out.println()(new App().getGreeting());
        Render render = new Render(); // Fix: Change 'Render' to 'IRender'
        IContextBuilder builder = render.newBuilder();
        ((Object) builder.width(120)).height(20);
        builder.element(new PseudoText("PseudoText"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);
    }
}