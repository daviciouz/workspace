// If Statements
// Use to make basic decisions

#include <iostream>

using namespace std;

int main()
{
	int a = 89;
	int b = 76;

	if(4 > 2) { 	// C++ using relational operators >= <
		cout << "C++ is awesome!" << endl;
	}

	if (5 == 5) {			// C++ using equality operators  == 
		cout << "Using equality test operator" << endl;
	}

	if (10 != 9) {
		cout << "Is 10 not equal to 9? or different from 9" << endl;
	}

	if (a >= b) {
		cout << "C++ and C are powerful \n programming but not \n for the swift" << endl;
	}

	return 0;
}