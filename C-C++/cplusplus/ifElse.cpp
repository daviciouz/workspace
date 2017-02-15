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
	
	else
		cout << "a is an Even number" << endl;
		
	
	return 0;
}

