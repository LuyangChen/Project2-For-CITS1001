/**
 * Represents a "Thing" that will be hidden on the board by the AIPlayer.
 *
 * @author Ms Caitlin Woods
 * @version April 2022
 * 
 * Student Names and Numbers: {Luyang Chen(23426352), Michael Sosulski(23385553)}
 */

import java.awt.Color;
import java.util.Arrays;

public class Item {

    private String type; // a string representing the type of the object, i.e. "phone" or "book".
    private int[][] shape; // a 2D array representing the shape of the object. hint: you can assume that 
                           //this is a square array where 1 represents an item piece and
                           // 0 represent an empty space.
    private Integer locationX; // the x location of of the shape (i.e. shape[0][0] is at locationX).
    private Integer locationY; // the y location of of the shape (i.e. shape[0][0] is at locationY).
    private boolean isFound; // a boolean representing whether or not a Item has been found by the player.

    /**
     * Constructor for the Item class
     * Initializes the instance varables.
     * hint: initialise locationX and locationY to -1
     */
    public Item(String type, int[][] shape) {
        // TODO 1
        this.type = type;
        this.shape = shape;
        locationX = -1;
        locationY = -1;
        isFound = false;
    }

    /**
     * Returns the type of the item
     * @return the type of the item
     */
    public String getType() {
        // TODO 2
        return type;
    }

    /**
     * Returns the shape of the item
     * @return the shape of the item
     */
    public int[][] getShape() {
        // TODO 3
        return shape;
    }

    /**
     * Sets the shape of an item to a new shape
     * @return the shape
     */
    public void setShape(int[][] newShape) {
        // TODO 4
        shape = newShape;
    }

    /**
     * Sets the state of the item to "found"
     */
    public void setFound() {
        // TODO 5
        isFound = true;
    }

    /**
     * Returns whether or not the item has been found by the player
     * @return true if the item has been found, false otherwise
     */
    public boolean getIsFound() {
        // TODO 6
        return isFound;
    }

    /**
     * Returns the x location of the item
     * @return the x location of the item
     */
    public int getLocationX() {
        // TODO 7
        return locationX;
    }

    /**
     * Returns the y location of the item
     * @return the y location of the item
     */
    public int getLocationY() {
        // TODO 8
        return locationY;
    }

    /**
     * Sets the x and y locations for the item.
     * @param xloc the x location
     * @param yloc the y location
     */
    public void setLocation(int xloc, int yloc) {
        // TODO 9
        locationX = xloc;
        locationY = yloc;
    }

    /**
     * Rotates the item (i.e. its shape) 90 degrees clockwise and sets the shape of the item as the
     * new rotated array.
     */
    public void rotate90Degrees() {
        // TODO 10
        
        //invert all x and y positions
        int[][] tempShape = new int[shape.length][shape[0].length];
        for (int i = 0; i < tempShape[0].length; i++){
            for (int j = 0; j < tempShape.length; j++){
                tempShape[i][j] = shape[j][i];
            }
        }
        //reverse the order of each row
        shape = tempShape;
        for (int i = 0; i < shape[0].length; i++){
            for (int j = 0; j < shape.length / 2; j++){
                int num = shape[i][j];
                shape[i][j] = shape[i][shape.length - j - 1];
                shape[i][shape.length - j - 1] = num;
            }
        }
    }
}
