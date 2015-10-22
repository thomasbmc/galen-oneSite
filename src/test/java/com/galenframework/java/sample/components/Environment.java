package com.galenframework.java.sample.components;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tmphillips on 16-10-2015.
 */
public interface Environment {
    //Preview Environment
    static final String ENV_URL_GP_PRE = "http://www.gol.wip.vdev.gidapps.com/";
    static final String ENV_URL_BR_PRE = "http://www.brol.wip.vdev.gidapps.com/";
    static final String ENV_URL_ON_PRE = "http://www.onol.wip.vdev.gidapps.com/";
    static final String ENV_URL_AT_PRE = "http://www.atol.wip.vdev.gidapps.com/";
    //VDEV Environment
    static final String ENV_URL_GP = "http://www.vdev.gidgol.com/";
    static final String ENV_URL_BR = "http://www.brol.vdev.gidgol.com/";
    static final String ENV_URL_ON = "http://www.onol.vdev.gidgol.com/";
    static final String ENV_URL_AT = "http://www.atol.vdev.gidgol.com/";


    final String email_prev_button = "//*[@id=\"preview_bar_link\"]";
    final String preview_setup_button = "//*[@id=\"preview_bar_setup\"]";
    final String turn_lights_off_button = "//*[@id=\"preview_toggle_high_light\"]";
    final String go_button = "//*[@id=\"previewContent\"]/form[1]/ul/li[5]/div/input";
    final String date_txtField = "//*[@id=\"date\"]";
    final String contry_dropMenu = "//*[@id=\"previewCountryCode\"]";
    final File inputio = new File("C:\\Users\\tmphillips\\Desktop\\galen-oneSite\\src\\test\\resources\\inputs\\previewBar.io");
}
