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

    public SaveNonGalenSpec(String title, List<String> includedTags, List<String> excludeTags, List<LayoutSection> sections,
                            Map<String, LayoutObjectDetails> objects, String screenshot, List<ValidationResult> validationErrorResults){
        this.title = title;
        this.includedTags = includedTags;
        this.excludedTags = excludeTags;
        this.sections = sections;
        this.objects = objects;
        this.screenshot = screenshot;
        this.validationErrorResults = validationErrorResults;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getIncludedTags() {
        return includedTags;
    }

    public void setIncludedTags(List<String> includedTags) {
        this.includedTags = includedTags;
    }

    public List<String> getExcludedTags() {
        return excludedTags;
    }

    public void setExcludedTags(List<String> excludedTags) {
        this.excludedTags = excludedTags;
    }

    public List<LayoutSection> getSections() {
        return sections;
    }

    public void setSections(List<LayoutSection> sections) {
        this.sections = sections;
    }

    public Map<String, LayoutObjectDetails> getObjects() {
        return objects;
    }

    public void setObjects(Map<String, LayoutObjectDetails> objects) {
        this.objects = objects;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public List<ValidationResult> getValidationErrorResults() {
        return validationErrorResults;
    }

    public void setValidationErrorResults(List<ValidationResult> validationErrorResults) {
        this.validationErrorResults = validationErrorResults;
    }

}
