//Problem Link: https://www.hackerrank.com/challenges/30-data-types/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";
    int a;
    float x;
    char c[40];
    scanf("%d\n%f\n", &a, &x);
    scanf("%[^\n]%*c", c);
    printf("%d\n%.1f\n", a+i, x+d);
    printf("%s%s", s, c);
    return 0;
}
