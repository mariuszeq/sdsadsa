#include <iostream>
#include <string>
using namespace std;

int main() {
    string slowo;
    cout << "Podaj słowo: ";
    cin >> slowo;

    bool palindrom = true;
    int n = slowo.length();

    // Sprawdzenie, czy słowo czyta się tak samo od przodu i od tyłu
    for (int i = 0; i < n / 2; i++) {
        if (slowo[i] != slowo[n - i - 1]) {
            palindrom = false;
            break;
        }
    }

    if (palindrom) {
        cout << "Słowo jest palindromem." << endl;
    } else {
        cout << "Słowo nie jest palindromem." << endl;
    }
    return 0;
}
