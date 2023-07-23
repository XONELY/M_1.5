package org.example.STRUCTURAL.PROXY;

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    private void loadFile(String fileName) {
        System.out.println("downloading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("showing " + fileName);
    }
}
