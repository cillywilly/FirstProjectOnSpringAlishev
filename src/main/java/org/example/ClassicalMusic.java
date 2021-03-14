package org.example;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}//для фабричного метода

    public static ClassicalMusic getClassicalMusicfabr() {
        return new ClassicalMusic();
    }
    
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("sozdal ClassicMusic");
    }

    public void doMyDestroy() {
        System.out.println("ydalil classicMusic");
    }
}
