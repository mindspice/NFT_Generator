package com.mindspice.imagefile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFile {


    private String name;
    private BufferedImage image;
    private File file ;
    private double weight;
    private int max;
    private int count;

    public ImageFile(String name, File image, double weight, int max) throws IOException {
        this.name = name.replace(".png", "");
        try {
            this.image = ImageIO.read(image);

        } catch(Exception e) {
            System.out.println("Error in loading Image");
        }
        this.file = image.getAbsoluteFile();
        this.weight = weight;

    }

// Getters

    public String getName() {
        return name;
    }

    public BufferedImage getImage() {
        return image;
    }

    public double getWeight() {
        return weight;
    }

    public int getMax() {
        return max;
    }

    public int getCount() {
        return count;
    }

    public String getFileName() {
        return file.toString();
    }
    public File getFile() {
        return file;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void incCount() {
        this.count++;
    }

    public void resetCount() {
        this.count = 0;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
