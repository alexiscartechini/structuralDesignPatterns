public class Canvas {

    public static void main(String[] args) {

        Checkbox checkbox = new Checkbox(new Small());
        checkbox.draw();

        Radio radio = new Radio(new Medium());
        radio.draw();

        Dropdown dropdown = new Dropdown(new Large());
        dropdown.draw();
    }
}
