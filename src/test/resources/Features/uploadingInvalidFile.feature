Feature: uploading

  Scenario: As a Manufacturer I should  not be able to upload a invalid file format
    Given user be able to login with "manuf_user30@info.com" and "manufuser"
    When  user clicked to contacts modul
    And user clicked to any contact on page
    And user clicked to edit button
    And user hover over to contact image
    And user clicks to pencil icon
    And user tries to upload a invalid file format
    Then system should display an error pop-up
    And user should not be able to upload
