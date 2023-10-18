Feature: Test login on ParaBank website
Scenario Outline: Attempt login into parabank with invalid login credentials
	Given Navigate to the site under test
	When I submit username <user> and password <pass>
	Then I should see the login error

	Examples:
	| user | pass    |
	| minu | taur123 |