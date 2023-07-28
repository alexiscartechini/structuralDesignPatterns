public class Radio extends Button {
    Size size;

    public Radio(Size size) {
        this.size = size;
    }

    public void draw() {
        size.draw();
        System.out.println("Drawing a radio button.\n");
    }
}
