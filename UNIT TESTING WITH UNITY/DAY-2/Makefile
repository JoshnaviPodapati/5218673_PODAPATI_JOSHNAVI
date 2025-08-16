object.o: evenorodd.c unity.c evenorodd_test.c
evenorodd_test.o: evenorodd.h unity.h evenorodd_test.c	
	gcc $^ -c

all: evenorodd_test.o evenorodd.o unity.o	
	gcc $^ -o $@

run: all
	./all

clean:
	rm -rf *.o all
