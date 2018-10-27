package me.bingpple.mobile.testsuites;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features/launch_chrome.feature" }, glue = {
                "me.bingpple.mobile.steps" }, snippets = SnippetType.CAMELCASE)
public class WebsitesLoadingTestSuite {
}