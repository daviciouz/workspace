//simple calculator
// >> stream extraction operator
// cin is input stream
#include <iostream>

using namespace std;

int main()
{
	int a, b, sum;

	cout << "Enter first number \n";
	cin >> a;

	cout << "Enter second number \n";
	cin >> b;

	sum = a + b;

	cout << "The sum of the numbers is "<< sum << endl; // the space between is and the last char 
														// ensures spacing before the value is output
	return 0;
}