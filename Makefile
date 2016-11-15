TESTS=soldiers.TestWeakSoldier

all: clean
	javac -d build src/soldiers/*.java test/*.java

tests: 
	java -ea -cp build  $(TESTS)

clean:
	rm -rf build*/*
	rm -rf src/#* src/*~
	rm -rf test/#* test/*~