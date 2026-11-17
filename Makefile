all:
	javac -d classes -sourcepath src src/org/ioopm/calculator/Test.java
	javac -d classes -sourcepath src src/org/ioopm/calculator/Calculator.java

run:
	java -ea -cp classes org.ioopm.calculator.Calculator
test:
	java -ea -cp classes org.ioopm.calculator.Test
clean:
	rm -rf classes