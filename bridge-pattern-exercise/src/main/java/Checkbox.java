public class Checkbox extends Button {

    Size size;

    public Checkbox(Size size) {
        this.size = size;
    }

    public void draw() {
        size.draw();
        System.out.println("Drawing a checkbox button.\n");
    }
}
