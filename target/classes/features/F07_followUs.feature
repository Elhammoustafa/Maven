@smoke
Feature: Follow us links

  Scenario: user opens facebook link
    When user click on facebook link
    Then get url from new opened tab "https://www.facebook.com/nopCommerce"

  Scenario: user opens twitter link
    When user click on twitter link
    Then get url from new opened tab "https://twitter.com/nopCommerce"

  Scenario: user opens rss link
    When user click on rss link
    Then get url from new opened tab "https://demo.nopcommerce.com/new-online-store-is-open"

  Scenario: user opens youtube link
    When user click on youtube link
    Then get url from new opened tab "https://www.youtube.com/user/nopCommerce"