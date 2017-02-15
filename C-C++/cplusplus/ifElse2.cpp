// i/o and IF Else example:

#include <iostream>

using namespace std;

int main()
{
	int a;

	cout << "Enter an integer value: ";
	cin >> a;

	if(a % 2 == 1)
		cout << "a is an Odd number" << endl;
	else if (a > 40)
		cout << "a is bigger Even number" << endl;
	else if (a > 5 and a <= 40)
		cout << "a is smaller Even number" << endl;
	else
		cout << "a is just an Even number" << endl;
	return 0;
}


/* if (x > 0)
  cout << "x is positive";
else if (x < 0)
  cout << "x is negative";
else
  cout << "x is 0"; */