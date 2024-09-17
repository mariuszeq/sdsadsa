#include <iostream>
#include <string>
using namespace std;

int main() {
    string slowo;
    cout << "Podaj słowo do zaszyfrowania: ";
    cin >> slowo;

    int klucz = 3;
    for (int i = 0; i < slowo.length(); i++) {
        if (isalpha(slowo[i])) {
            char baza = isupper(slowo[i]) ? 'A' : 'a';
            slowo[i] = (slowo[i] - baza + klucz) % 26 + baza;
        }
    }

    cout << "Zaszyfrowane słowo: " << slowo << endl;

    return 0;
}
