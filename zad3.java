#include <iostream>
using namespace std;

bool czyPalindrom(int liczba) {
    string str = to_string(liczba);
    int n = str.length();
    for (int i = 0; i < n / 2; i++) {
        if (str[i] != str[n - i - 1]) {
            return false;
        }
    }
    return true;
}

int main() {
    int liczba;
    cout << "Podaj liczbę: ";
    cin >> liczba;

    int mniejsza = liczba - 1;
    int wieksza = liczba + 1;

    // Szukanie najbliższego palindromu w dół
    while (!czyPalindrom(mniejsza)) {
        mniejsza--;
    }

    // Szukanie najbliższego palindromu w górę
    while (!czyPalindrom(wieksza)) {
        wieksza++;
    }

    if (liczba - mniejsza <= wieksza - liczba) {
        cout << "Najbliższa liczba palindromiczna: " << mniejsza << endl;
    } else {
        cout << "Najbliższa liczba palindromiczna: " << wieksza << endl;
    }

    return 0;
}
