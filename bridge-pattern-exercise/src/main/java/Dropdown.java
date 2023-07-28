public class Dropdown extends Button {

    Size size;

    public Dropdown(Size size) {
        this.size = size;
    }

    public void draw() {
        size.draw();
        System.out.println("Drawing a dropdown button.\n");
    }
}
