#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string slowo1, slowo2;
    cout << "Podaj pierwsze słowo: ";
    cin >> slowo1;
    cout << "Podaj drugie słowo: ";
    cin >> slowo2;

    // Sprawdzanie długości słów
    if (slowo1.length() != slowo2.length()) {
        cout << "Słowa nie są anagramami." << endl;
        return 0;
    }

    // Sortowanie liter w obu słowach
    sort(slowo1.begin(), slowo1.end());
    sort(slowo2.begin(), slowo2.end());

    if (slowo1 == slowo2) {
        cout << "Słowa są anagramami." << endl;
    } else {
        cout << "Słowa nie są anagramami." << endl;
    }

    return 0;
}
