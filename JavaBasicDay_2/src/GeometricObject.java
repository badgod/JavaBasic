public class GeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    GeometricObject() {
        dateCreated = new java.util.Date();
    }

    GeometricObject(String newColor, boolean newFilled) {
        dateCreated = new java.util.Date();
        this.color = newColor;
        this.filled = newFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Created on " + dateCreated + "\nColor : " + color + " And Filled " + filled;
    }
}
