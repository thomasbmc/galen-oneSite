package com.galenframework.java.sample.components;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.galenframework.reports.model.LayoutObjectDetails;
import com.galenframework.reports.model.LayoutReport;
import com.galenframework.reports.model.LayoutSection;
import com.galenframework.validation.ValidationResult;

import java.util.*;

/**
 * Created by tmphillips on 15-10-2015.
 */
public class SaveNonGalenSpec {

    public String title;
    public List<String> includedTags = new ArrayList<String>();
    public List<String> excludedTags = new ArrayList<String>();

    public List<LayoutSection> sections = new LinkedList<LayoutSection>();
    public Map<String, LayoutObjectDetails> objects = new HashMap<String, LayoutObjectDetails>();

    public String screenshot;

    @JsonIgnore
    public List<ValidationResult> validationErrorResults;

    public SaveNonGalenSpec(){}
}
