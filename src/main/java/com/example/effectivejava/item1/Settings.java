package com.example.effectivejava.item1;

public class Settings {
    private boolean useAutoSteerint;
    private boolean useABS;
    private Difficulty difficulty;

    private Settings(){}

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance(){
        return SETTINGS;
    }

    public static void main(String[] args) {
        Settings setting1 = Settings.newInstance();
        Settings setting2 = Settings.newInstance();
        if (setting1.equals(setting2)){
            System.out.println("dfas");
        }
    }
}
