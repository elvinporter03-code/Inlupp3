all:
	javac -d classes -sourcepath src org.ioopm.calculator/Calculator.java
run:
	java -cp classes org.ioopm.calculator.Calculator
clean:
	rm -rf classes