package com.galenframework.java.sample.components;

import com.galenframework.java.sample.components.Html.Log;

import java.io.IOException;
import java.util.List;

/**
 * Created by tmphillips on 16-10-2015.
 */
public interface LogWritter {
    List<Log> buildTestArray(String[] arrayInputs, List<String> tags);
    Log buildTest(String input, List<String> tags);
}
