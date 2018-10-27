
@chrome
Feature: launch Chrome and load Google on mobile device
    I want to launch Chrome browser on mobile devices and go to Google

    @saucelabs
    Scenario: Launch Chrome and load Google home page
        Given user has launched Chrome browser
        When user wants to load "http://saucelabs.com/test/guinea-pig"
        Then "http://saucelabs.com/test/guinea-pig" page should be loaded
        When user adds comment as "apple"
        And user clicks the send button
# Then user should see resultsß