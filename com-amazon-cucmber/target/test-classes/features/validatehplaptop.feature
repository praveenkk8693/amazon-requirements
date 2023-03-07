Feature: validating 5 rated  hp laptop to check ramsize


@Regression
Scenario:  validating ram size
Given loginto amazon
When search hp laptops and click on 5 rated laptop
Then validate the ram size is diplayed or not

@Regression
Scenario: validating xpaths 

Given open amazon
Then print and validate xpath result

