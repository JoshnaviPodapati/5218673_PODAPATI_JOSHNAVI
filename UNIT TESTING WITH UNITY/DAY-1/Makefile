object.o: sum.c unity.c sum_test.c
	gcc $^ -c

a: sum_test.o sum.o unity.o
	gcc $^ -o $@

run: a
	./a

clean:
	rm -rf *.o a
