#include <stdio.h>

int main() {
    int i;
    int j;
    int sum = 0;
            
    for (i = 0; i < 10; ++i) {
        sum += i;
    }
            
    j = 0;
    while (j < 10) {
        sum += j;
        ++j;
    }
        
    return 0;
}