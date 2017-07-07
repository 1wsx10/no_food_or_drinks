#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* 'no food or drinks'*/
int nfod(int food, int drinks) {
	return !food||drinks;
}

void truth_table_names(char* n1, char* n2, char* n_func, int operation(int a, int b)) {
	int a = 0;
	int b = 0;
	int a_l = strlen(n1)+2;
	int b_l = strlen(n2)+2;

	printf("%-*s%-*s%s\n", a_l, n1, b_l, n2, n_func);

	printf("%-*d%-*d%d\n", a_l, a, b_l, b, operation(a, b));
	b = !b;
	printf("%-*d%-*d%d\n", a_l, a, b_l, b, operation(a, b));
	a = !a;
	b = !b;
	printf("%-*d%-*d%d\n", a_l, a, b_l, b, operation(a, b));
	b = !b;
	printf("%-*d%-*d%d\n", a_l, a, b_l, b, operation(a, b));
}

void truth_table(int operation(int a, int b)) {
	int a = 0;
	int b = 0;

	printf("a\tb\toperation\n");

	printf("%d\t%d\t%d\n", a, b, operation(a, b));
	b = !b;
	printf("%d\t%d\t%d\n", a, b, operation(a, b));
	a = !a;
	b = !b;
	printf("%d\t%d\t%d\n", a, b, operation(a, b));
	b = !b;
	printf("%d\t%d\t%d\n", a, b, operation(a, b));
}

int main() {

	printf("no food or drinks: !food||drinks\n\n");
	truth_table_names("food", "drinks", "no food or drinks", nfod);
	
	return EXIT_SUCCESS;
}
