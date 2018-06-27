# Real FizzBuzz
Real Fizzbuzz assignment - 925cf7f189d1e404cfd55df6e8398d831df0f45a

Solution is packaged as one zip instead of multiple zip files
for each step as specified in the requirements for ease of distribution.

## The Project
This is a gradle project. The only assumption is that the user would 
have gradle setup in the path to run the project since the dependent 
jars are not shipped together.

To run this project, unzip the contents to a directory
and run the following commands to run the code

### Build :
To run a build,

> gradle build -PrunArgs=all

### Run Step 1:
To run the first step, run the following command,

> gradle run -PrunArgs=step1

### Run Step 2:
To run the first step, run the following command,

> gradle run -PrunArgs=step2

### Run Step 3:
To run the first step, run the following command,

> gradle run -PrunArgs=step3

### Run All Steps 
To run all the steps, run the following command,

> gradle run -PrunArgs=all

### Run All Junit Tests
To run all the junit tests, run the following command,

> gradle test -PrunArgs=all

A test report can be found in build/reports/tests/test/index.html

### Run Code Coverage
To run code coverage, run the following command,

> gradle jacocoTestReport -PrunArgs=all

A coverage report can be found in build/reports/jacoco/test/html/index.html

