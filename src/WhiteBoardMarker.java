public class WhiteBoardMarker implements Drawable,Erasable{

    @Override
    public void draw() {
        System.out.println("Drawing!");
    }

    @Override
    public void erase() {
        System.out.println("Erasing!");
    }

    public static void main(String[] args) {
        WhiteBoardMarker wb = new WhiteBoardMarker();
        wb.draw();
        wb.erase();
    }
}
