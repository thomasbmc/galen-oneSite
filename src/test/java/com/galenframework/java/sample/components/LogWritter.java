package com.galenframework.java.sample.components;

import java.io.IOException;
import java.util.List;

/**
 * Created by tmphillips on 16-10-2015.
 */
public interface LogWritter {
  void WriteLog(List<Log> logs) throws IOException;
}
