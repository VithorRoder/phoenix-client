package br.com.phoenix.client.ui.theme;

import com.formdev.flatlaf.FlatLaf;

import java.lang.reflect.Method;

public final class ThemeCycler {

    private ThemeCycler() {
    }

    private static final String[][] THEMES = {
        // IntelliJ Themes Pack
        {"Arc", "com.formdev.flatlaf.intellijthemes.FlatArcIJTheme"},
        {"Arc - Orange", "com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme"},
        {"Arc Dark", "com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme"},
        {"Arc Dark - Orange", "com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme"},
        {"Carbon", "com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme"},
        {"Cobalt 2", "com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme"},
        {"Cyan light", "com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme"},
        {"Dark Flat", "com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme"},
        {"Dark purple", "com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme"},
        {"Dracula", "com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme"},
        {"Gradianto Dark Fuchsia", "com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme"},
        {"Gradianto Deep Ocean", "com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme"},
        {"Gradianto Midnight Blue", "com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme"},
        {"Gradianto Nature Green", "com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme"},
        {"Gray", "com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme"},
        {"Gruvbox Dark Hard", "com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme"},
        {"Hiberbee Dark", "com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme"},
        {"High Contrast", "com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme"},
        {"Light Flat", "com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme"},
        {"Material Design Dark", "com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme"},
        {"Monocai", "com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme"},
        {"Monokai Pro", "com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme"},
        {"Nord", "com.formdev.flatlaf.intellijthemes.FlatNordIJTheme"},
        {"One Dark", "com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme"},
        {"Solarized Dark", "com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme"},
        {"Solarized Light", "com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme"},
        {"Spacegray", "com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme"},
        {"Vuesion", "com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme"},
        {"Xcode-Dark", "com.formdev.flatlaf.intellijthemes.FlatXcodeDarkIJTheme"},
        // Material Theme UI Lite
        {"Arc Dark", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTArcDarkIJTheme"},
        {"Atom One Dark", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTAtomOneDarkIJTheme"},
        {"Atom One Light", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTAtomOneLightIJTheme"},
        {"Dracula", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTDraculaIJTheme"},
        {"GitHub", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTGitHubIJTheme"},
        {"GitHub Dark", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTGitHubDarkIJTheme"},
        {"Light Owl", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTLightOwlIJTheme"},
        {"Material Darker", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialDarkerIJTheme"},
        {"Material Deep Ocean", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialDeepOceanIJTheme"},
        {"Material Lighter", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme"},
        {"Material Oceanic", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialOceanicIJTheme"},
        {"Material Palenight", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialPalenightIJTheme"},
        {"Monokai Pro", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMonokaiProIJTheme"},
        {"Moonlight", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMoonlightIJTheme"},
        {"Night Owl", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTNightOwlIJTheme"},
        {"Solarized Dark", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTSolarizedDarkIJTheme"},
        {"Solarized Light", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTSolarizedLightIJTheme"}
    };

    private static int index = 0;

    public static void toggleTheme() {
        index = (index + 1) % THEMES.length;
        applyTheme(index);
    }

    public static String[] getThemeNames() {
        String[] names = new String[THEMES.length];
        for (int i = 0; i < THEMES.length; i++) {
            names[i] = THEMES[i][0];
        }
        return names;
    }

    public static void applyTheme(int i) {
        if (i < 0 || i >= THEMES.length) {
            return;
        }
        String name = THEMES[i][0];
        String className = THEMES[i][1];

        try {
            Class<?> clazz = Class.forName(className);
            Method setup = clazz.getMethod("setup");
            setup.invoke(null);
            FlatLaf.updateUI();
            System.out.println("Tema aplicado: " + name + " (" + className + ")");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
