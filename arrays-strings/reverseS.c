#include <stdio.h>
#include <string.h>

void reverseString(char* s) {
    int left = 0;
    int right = strlen(s) - 1;

    
    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left++;
        right--;
    }
}

int main() {
    char s[256];

    printf("Enter a string to reverse: ");
    fgets(s, sizeof(s), stdin);
        reverseString(s);
        printf("Reversed string: %s\n", s);
    }