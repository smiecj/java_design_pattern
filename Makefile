build:
	mvn clean package -DskipTests
	java -jar target/gs-maven-0.1.0.jar 

test_template:
	mvn test -Dtest=design.template.DisplayTest

test_bridge:
	mvn test -Dtest=design.bridge.DisplayTest