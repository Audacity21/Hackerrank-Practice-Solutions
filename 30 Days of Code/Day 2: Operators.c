//Problem Link: https://www.hackerrank.com/challenges/30-operators/

#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int tip, tax, x;
    float meal, amt;
    scanf("%f\n%d\n%d", &meal, &tip, &tax);
    amt=((tip/100.0)*meal)+((tax/100.0)*meal) + meal;
    x=round(amt);
    printf("%d", x);
    
    return 0;
}
