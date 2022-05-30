build:
	mvn clean package -DskipTests
	java -jar target/gs-maven-0.1.0.jar 

test_design_template:
	mvn test -Dtest=design.template.DisplayTest